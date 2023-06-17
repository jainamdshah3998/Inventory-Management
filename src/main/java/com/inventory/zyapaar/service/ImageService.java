package com.inventory.zyapaar.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.inventory.zyapaar.dao.entity.ImageEntity;
import com.inventory.zyapaar.dao.repository.ImageRepository;
import com.inventory.zyapaar.dto.ImageDto;

public class ImageService {
	
	private final ImageRepository imageRepository;
	
	public ImageService(final ImageRepository imageRepository) {
		this.imageRepository = imageRepository;
	}
	
	public void storeImage(MultipartFile multifile)  {
		ImageEntity imageEntity = new ImageEntity();
		try {
			imageEntity.setImage(multifile.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		imageRepository.save(imageEntity);
		
	}

	public ImageDto getAllImage() {
		return new ImageDto(imageRepository.findAll().get(0));
		
	}

}
