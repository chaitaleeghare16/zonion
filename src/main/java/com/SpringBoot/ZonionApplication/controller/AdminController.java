package com.SpringBoot.ZonionApplication.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.ZonionApplication.model.Admin;
import com.SpringBoot.ZonionApplication.service.AdminService;


@RestController
@CrossOrigin(origins = "*")
public class AdminController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AdminController.class);
	
	 @Autowired
	    private AdminService adminservice;

	    
	    @PostMapping("/checkAdmin")
	    public boolean checkAdminCredentials(@RequestBody Admin admin)
	    {
	    	    
	    		LOGGER.info("inside Admin Controller");
	    		return adminservice.checkAdminCredentials(admin);
	    	
	    }
	 
	
	 
}
