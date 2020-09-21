package com.SpringBoot.ZonionApplication.service;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.SpringBoot.ZonionApplication.controller.AdminController;
import com.SpringBoot.ZonionApplication.model.Admin;
import com.SpringBoot.ZonionApplication.repository.AdminRepository;



@Service

public class AdminService{
	private static final Logger LOGGER = LoggerFactory.getLogger(AdminService.class);
	
	    @Autowired
	    private AdminRepository adminrepository;

	  
		public boolean checkAdminCredentials(Admin admin) {
			LOGGER.trace("Entering into method checkAdminCredentials" );
			
			
			String username = admin.getUsername();
			 LOGGER.debug("Authenticating admin with username");
			 
			 Admin adminuser=adminrepository.findByUsername(username);
			
			 System.out.println("database"+adminuser.getUsername());
			 LOGGER.debug("admin found");
			
			 if(adminuser == null) {
				 
				 LOGGER.error("admin user not found");
		            throw new RuntimeException("User does not exist.");
		        }
		        if(!adminuser.getPassword().equals(admin.getPassword())){
		             LOGGER.error("admin user password not matched");  
		            throw new RuntimeException("Password mismatch.");
		        }
		        
		      
		      LOGGER.info("admin authenticated successfully..");
		        return  true;
		   
		}




}
