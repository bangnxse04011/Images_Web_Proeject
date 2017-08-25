package com.images.sex.dto;

import java.util.List;

public class ImageViewerDTO {
	private String linkAvatar;
	private String albumName;
	private String description;
	private String linkDownload;
	private List<String> sampleImageLinks;
	private List<String> tags;

	public ImageViewerDTO() {
		super();
	}

	public ImageViewerDTO(String linkAvatar, String albumName, String description, String linkDownload,
			List<String> sampleImageLinks, List<String> tags) {
		super();
		this.linkAvatar = linkAvatar;
		this.albumName = albumName;
		this.description = description;
		this.linkDownload = linkDownload;
		this.sampleImageLinks = sampleImageLinks;
		this.tags = tags;
	}

	public String getLinkAvatar() {
		return linkAvatar;
	}

	public void setLinkAvatar(String linkAvatar) {
		this.linkAvatar = linkAvatar;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLinkDownload() {
		return linkDownload;
	}

	public void setLinkDownload(String linkDownload) {
		this.linkDownload = linkDownload;
	}

	public List<String> getSampleImageLinks() {
		return sampleImageLinks;
	}

	public void setSampleImageLinks(List<String> sampleImageLinks) {
		this.sampleImageLinks = sampleImageLinks;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

}
