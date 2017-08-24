package com.images.sex.entity.impl;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.images.sex.entity.ImgThumbnai;
import com.images.sex.entity.ImgVier;
import com.images.sex.entity.User;
import com.images.sex.entity.custom.ImagesCustom;
import com.images.sex.entity.db.MysqlDataSource;
import com.images.sex.entity.enums.AccountStatus;
import com.images.sex.entity.enums.ImgStatus;

public class ImgImpl implements ImagesCustom, Serializable {

	/**
	 * 
	 */
	/**
	 * 
	 */
	private static final long 			serialVersionUID = 1L;
	private static StringBuilder 		stringBuilder 	= null;
	private static Connection 			conn 			= null;
	private static PreparedStatement 	ps 				= null;
	private static ResultSet 			rs 				= null;
	private static List<ImgVier> 		listImgs		= null;

	public Iterable<ImgVier> findAllImg() {
		ImgStatus status;
		listImgs = new ArrayList<ImgVier>();
		conn = MysqlDataSource.getInstance().getConnect();
		stringBuilder = new StringBuilder();
		stringBuilder.append("SELECT * FROM img_viewer");
		ps = conn.prepareStatement(stringBuilder.toString());
		rs = ps.executeQuery();
		while(rs.next()) {
			Integer imgId = rs.getInt(1);
			String imgName = rs.getString(2);
			String imgLink = rs.getString(3);
			String imgDes = rs.getString(4);
			String st = rs.getString(5);
			String name = rs.getString(6);
			String nameUUID = rs.getString(7);
			Integer imgIdThum = rs.getInt(8);
			Integer imgIdLibrary = rs.getInt(9);
			Date date = rs.getDate(10);
			Double money = rs.getDouble(11);
			if(st.equals("ACTIVE")) {
				status = ImgStatus.ACTIVE;
			} else {
				status = ImgStatus.BLOCKED;
			}
			listImgs.add(new ImgVier(imgId, imgName, imgLink, imgDes, status, name, nameUUID, ImgThumbnai, imgIdLibrary, date, money));
		}
		return listUser;
	}

}
