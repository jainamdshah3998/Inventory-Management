package com.inventory.zyapaar.dto;

import com.inventory.zyapaar.dao.entity.ImageEntity;

public class ImageDto {
	
	
	public ImageDto(ImageEntity imageEntity) {
		this.id = imageEntity.getId();
		this.image = imageEntity.getImage();
	}

	private long id;
	
	private byte[] image;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
}
