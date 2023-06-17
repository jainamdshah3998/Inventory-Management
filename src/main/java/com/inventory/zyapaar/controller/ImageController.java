package com.inventory.zyapaar.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.inventory.zyapaar.dto.ImageDto;
import com.inventory.zyapaar.service.ImageService;

@RestController
@RequestMapping("/image")
public class ImageController {
	
	private final ImageService imageService;
	
	public ImageController(final ImageService imageService) {
		this.imageService = imageService;
	}

	@PostMapping
	public void storeImage(@RequestParam("file") MultipartFile multifile) {
		imageService.storeImage(multifile);
	}
	
	@GetMapping
	public ResponseEntity<byte[]> getImages() {
		ImageDto imageDto = imageService.getAllImage();
		return new ResponseEntity<>(imageDto.getImage(),HttpStatus.OK);
	}
}
