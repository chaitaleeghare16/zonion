package com.SpringBoot.ZonionApplication.controller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity.BodyBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.SpringBoot.ZonionApplication.model.Image;
import com.SpringBoot.ZonionApplication.repository.ImageRepository;


@RestController
@CrossOrigin(origins ="*")
public class ImageController {
	@Autowired
	private static final Logger LOGGER = LoggerFactory.getLogger(ImageController.class);
	
	  @Autowired
	   private ImageRepository imagerepository;
	
	    	private static String imageDirectory = "/Users/yogesh/Documents/WishTreeAssignment/zonion/public";

	    @RequestMapping(value = "/upload")
	    public ResponseEntity<?> uploadImage(@RequestParam("myFile")MultipartFile file,@RequestParam("filename")String name,@RequestParam("restaurantname")String restname) {
	    		
	    		LOGGER.info("inside upload api");
	        makeDirectoryIfNotExist(imageDirectory);
	       // String name = file.getName();
	        LOGGER.info("file name is "+name);
	        LOGGER.info("restaurantname is :"+restname);
	        String finalfileName = restname.concat("_").concat(name); //filepath as-> restaurantname_imagename
	        Path fileNamePath = Paths.get(imageDirectory,finalfileName);
	        LOGGER.info("filepath  is "+fileNamePath);
	        try {
	            Files.write(fileNamePath, file.getBytes());
	            return new ResponseEntity<>(finalfileName, HttpStatus.OK);
	        } catch (IOException ex) {
	            return new ResponseEntity<>("Image is not uploaded", HttpStatus.BAD_REQUEST);
	        }
	    }

	    private void makeDirectoryIfNotExist(String imageDirectory) {
	        File directory = new File(imageDirectory);
	        if (!directory.exists()) {
	            directory.mkdir();
	        }
	    }
}
