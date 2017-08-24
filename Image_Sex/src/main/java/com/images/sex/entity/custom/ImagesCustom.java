package com.images.sex.entity.custom;

import java.sql.SQLException;

import com.images.sex.entity.ImgViewer;

public interface ImagesCustom {

	/**
	 * Method findAll Images
	 * 
	 * @return : List data images
	 * @throws SQLException 
	 */
	public Iterable<ImgViewer> findAllImg() throws SQLException;

}
