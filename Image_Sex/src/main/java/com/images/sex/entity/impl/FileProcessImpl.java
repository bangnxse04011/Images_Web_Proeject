package com.images.sex.entity.impl;

import java.io.IOException;
import java.io.Serializable;

import com.google.api.client.http.FileContent;
import com.google.api.services.drive.Drive; 
import com.google.api.services.drive.DriveScopes; 
import com.google.api.services.drive.model.File;

public class FileProcessImpl implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	private static File uploadFile(boolean useDirectUpload) throws IOException { 
//	    File fileMetadata = new File(); 
//	    fileMetadata.setName(""); 
//	 
//	    FileContent mediaContent = new FileContent("image/jpeg", UPLOAD_FILE); 
//	    Drive.Files.Insert insert = drive.files().insert(fileMetadata, mediaContent); 
//	    MediaHttpUploader uploader = insert.getMediaHttpUploader(); 
//	    uploader.setDirectUploadEnabled(useDirectUpload); 
//	    uploader.setProgressListener(new FileUploadProgressListener()); 
//	    return insert.execute(); 
//	  } 

}
