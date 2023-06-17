package com.inventory.zyapaar.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.inventory.zyapaar.dto.ImageDto;

@Table(name= "images")
@Entity
public class ImageEntity {
	
	public ImageEntity() {}

	public ImageEntity(ImageDto imageDto) {
		this.id = imageDto.getId();
		this.image = imageDto.getImage();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Lob
	@Column(name = "image")
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
