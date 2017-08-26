package com.images.sex.entity.impl;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;

import com.images.sex.dto.ImageViewerDTO;
import com.images.sex.entity.ImgViewer;
import com.images.sex.entity.custom.ImagesCustom;
import com.images.sex.entity.db.MysqlDataSource;

public class ImgImpl implements ImagesCustom, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static StringBuilder stringBuilder = null;
	private static Connection conn = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;
	private static List<ImgViewer> listImgs = null;

	/**
	 * @throws SQLException
	 * 
	 */
	public Iterable<ImgViewer> findAllImg() throws SQLException {
		// ImgStatus status;
		ImgViewer imgViewer = new ImgViewer();
		listImgs = new ArrayList<ImgViewer>();
		conn = MysqlDataSource.getInstance().getConnect();
		stringBuilder = new StringBuilder();
		stringBuilder.append("SELECT * FROM img_viewer i ");
		stringBuilder.append("WHERE i.img_status != 'BLOCKED' ");
		ps = conn.prepareStatement(stringBuilder.toString());
		System.out.println(stringBuilder.toString());
		rs = ps.executeQuery();
		while (rs.next()) {
			Integer imgId = rs.getInt(1);
			String imgName = rs.getString(2);
			String avatarLink = rs.getString(3);
			String imgDes = rs.getString(4);
			imgViewer.setId(imgId);
			imgViewer.setSourceAvata(avatarLink);
			imgViewer.setDescription(imgDes);
			imgViewer.setNameViewer(imgName);
			listImgs.add(imgViewer);
		}
		DbUtils.closeQuietly(conn, ps, rs);
		return listImgs;
	}

	/**
	 * cần tạo thêm bảng img_library_viewer
	 * 
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public ImageViewerDTO findOne(Integer id) throws SQLException {
		ImageViewerDTO imageViewerDTO = new ImageViewerDTO();
		conn = MysqlDataSource.getInstance().getConnect();
		stringBuilder = new StringBuilder();
		stringBuilder.append("SELECT * FROM img_viewer i ");
		stringBuilder.append("INNER JOIN img_library_viewer ilv ");
		stringBuilder.append("ON i.img_id = ilv.img_id ");
		stringBuilder.append("INNER JOIN img_library il ");
		stringBuilder.append("ON ilv.img_library_id = il.img_library_id ");
		stringBuilder.append("WHERE i.img_status != 'BLOCKED' AND i.img_id = ? ");
		ps = conn.prepareStatement(stringBuilder.toString());
		ps.setInt(1, id);
		System.out.println(stringBuilder.toString());
		rs = ps.executeQuery();
		if (rs.next()) {
			String imgName = rs.getString("img_name");
			String avatarLink = rs.getString("img_link_avata");
			String imgDes = rs.getString("img_description");
			String linkDownload = rs.getString("img_library_name");
			imageViewerDTO.setAlbumName(imgName);
			imageViewerDTO.setDescription(imgDes);
			imageViewerDTO.setLinkAvatar(avatarLink);
			imageViewerDTO.setLinkDownload(linkDownload);
			
		}
		DbUtils.closeQuietly(conn, ps, rs);
		List<String> tags = findTagByAlbumId(id);
		List<String> sampleImages = findSampleImageByAlbumId(id);
		imageViewerDTO.setSampleImageLinks(sampleImages);
		imageViewerDTO.setTags(tags);
		return imageViewerDTO;
	}

	/**
	 * cần tạo thêm bảng img_thub_viewer
	 * 
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public List<String> findSampleImageByAlbumId(Integer id) throws SQLException {
		List<String> listSampleLinks = new ArrayList<String>();
		conn = MysqlDataSource.getInstance().getConnect();
		stringBuilder = new StringBuilder();
		stringBuilder.append("SELECT * FROM img_viewer i ");
		stringBuilder.append("INNER JOIN img_thub_viewer itv ");
		stringBuilder.append("ON i.img_id = itv.img_id ");
		stringBuilder.append("INNER JOIN img_thub it ");
		stringBuilder.append("ON itv.img_thub_id = it.img_thub_id ");
		stringBuilder.append("WHERE i.img_status != 'BLOCKED' AND i.img_id = ?");
		ps = conn.prepareStatement(stringBuilder.toString());
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while (rs.next()) {
			String name = rs.getString("img_thub_name_uuid");
			listSampleLinks.add(name);
		}
		DbUtils.closeQuietly(conn, ps, rs);
		return listSampleLinks;
	}

	/**
	 * cần tạo thêm bảng img_tag_viewer
	 * 
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public List<String> findTagByAlbumId(Integer id) throws SQLException {
		List<String> listTags = new ArrayList<String>();
		conn = MysqlDataSource.getInstance().getConnect();
		stringBuilder = new StringBuilder();
		stringBuilder.append("SELECT * FROM img_viewer i ");
		stringBuilder.append("INNER JOIN img_tag_viewer itv ");
		stringBuilder.append("ON i.img_id = itv.img_viewer_id ");
		stringBuilder.append("INNER JOIN img_tag it ");
		stringBuilder.append("ON itv.img_tag_id = it.img_tag_id ");
		stringBuilder.append("WHERE i.img_status != 'BLOCKED' AND i.img_id = ? ");
		ps = conn.prepareStatement(stringBuilder.toString());
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while (rs.next()) {
			String name = rs.getString("img_tag_name");
			listTags.add(name);
		}
		DbUtils.closeQuietly(conn, ps, rs);
		return listTags;
	}
	public List<ImgViewer> findImageByTag (int tagId) throws SQLException{
		List<ImgViewer> images = new ArrayList<ImgViewer>();
		ImgViewer imgViewer = new ImgViewer();
		listImgs = new ArrayList<ImgViewer>();
		conn = MysqlDataSource.getInstance().getConnect();
		stringBuilder = new StringBuilder();
		stringBuilder.append("SELECT i.* FROM img_viewer i ");
		stringBuilder.append("INNER JOIN img_tag_viewer itv ");
		stringBuilder.append("ON i.img_id = itv.img_viewer_id ");
		stringBuilder.append("INNER JOIN img_tag it ");
		stringBuilder.append("ON itv.img_tag_id = it.img_tag_id ");
		stringBuilder.append("WHERE i.img_status != 'BLOCKED' AND it.img_tag_id = ? ");
		ps = conn.prepareStatement(stringBuilder.toString());
		System.out.println(stringBuilder.toString());
		ps.setInt(1, tagId);
		rs = ps.executeQuery();
		while (rs.next()) {
			Integer imgId = rs.getInt(1);
			String imgName = rs.getString(2);
			String avatarLink = rs.getString(3);
			String imgDes = rs.getString(4);
			imgViewer.setId(imgId);
			imgViewer.setSourceAvata(avatarLink);
			imgViewer.setDescription(imgDes);
			imgViewer.setNameViewer(imgName);
			images.add(imgViewer);
		}
		DbUtils.closeQuietly(conn, ps, rs);
		return images;
	}
	public static void main(String args[]) throws SQLException {
//		try {
//			ImageViewerDTO dto = new ImgImpl().findOne(1);
//			System.out.println(dto.getAlbumName());
//			System.out.println(dto.getDescription());
//			System.out.println(dto.getLinkAvatar());
//			System.out.println(dto.getLinkDownload());
//			List<String> tags = dto.getTags();
//			for (String string : tags) {
//				System.out.print(string + "\t");
//			}
//			System.out.println("\n");
//			List<String> samples = dto.getSampleImageLinks();
//			for (String string : samples) {
//				System.out.print(string + "\t");
//			}
//			List<ImgViewer> list = new ImgImpl().findImageByTag(1);
//			for (ImgViewer imgViewer : list) {
//				System.out.println(imgViewer.getNameViewer());
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println(new ImgImpl().findAllImg());
	}

}
