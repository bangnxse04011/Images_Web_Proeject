package com.images.sex.entity.impl;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.images.sex.entity.ImgViewer;
import com.images.sex.entity.custom.ImagesCustom;
import com.images.sex.entity.db.MysqlDataSource;

public class ImgImpl implements ImagesCustom, Serializable {

	/**
	 * 
	 */
	private static final long 			serialVersionUID = 1L;
	private static StringBuilder 		stringBuilder 	= null;
	private static Connection 			conn 			= null;
	private static PreparedStatement 	ps 				= null;
	private static ResultSet 			rs 				= null;
	private static List<ImgViewer> 		listImgs		= null;

	/**
	 * @throws SQLException 
	 * 
	 */
	public Iterable<ImgViewer> findAllImg() throws SQLException {
		//ImgStatus status;
		ImgViewer imgViewer = new ImgViewer();
		listImgs = new ArrayList<ImgViewer>();
		conn = MysqlDataSource.getInstance().getConnect();
		stringBuilder = new StringBuilder();
		stringBuilder.append("SELECT i.* FROM img_viewer i ");
		stringBuilder.append("INNER JOIN img_thub it ");
		stringBuilder.append("ON i.img_id = it.img_thub_id ");
		stringBuilder.append("INNER JOIN img_library il ");
		stringBuilder.append("ON i.img_id = il.img_library_id ");
		stringBuilder.append("WHERE i.img_status != 'BLOCKED' ");
		ps = conn.prepareStatement(stringBuilder.toString());
		//ps.setString(1, "BLOCKED");
		System.out.println(stringBuilder.toString());
		rs = ps.executeQuery();
		while(rs.next()) {
			//Integer imgId = rs.getInt(1);
			String imgName = rs.getString(2);
			String imgLink = rs.getString(3);
			String imgDes = rs.getString(4);
			//String st = rs.getString(5);
			//String name = rs.getString(6);
			//String nameUUID = rs.getString(7);
			//Integer imgIdThum = rs.getInt(8);
			//Integer imgIdLibrary = rs.getInt(9);
			//Date date = rs.getDate(10);
			//Double money = rs.getDouble(11);
			
//			if(st.equals("ACTIVE")) {
//				status = ImgStatus.ACTIVE;
//			} else {
//				status = ImgStatus.BLOCKED;
//			}
			imgViewer.setSourceAvata(imgLink);
			imgViewer.setDescription(imgDes);
			imgViewer.setNameViewer(imgName);
			listImgs.add(imgViewer);
		}
		return listImgs;
	}

}
