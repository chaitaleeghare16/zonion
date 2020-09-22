package com.SpringBoot.ZonionApplication.service;


import com.SpringBoot.ZonionApplication.model.Restaurant;
import com.SpringBoot.ZonionApplication.repository.RestaurantRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RestaurantService.class);
    @Autowired
    private RestaurantRepository repository;

    public Restaurant saveRestaurant(Restaurant restaurant) {
    	LOGGER.debug("Entering into saveRestaurant method");
    	LOGGER.info("restaurant data added successfully");
        return repository.save(restaurant);
    }

    public List<Restaurant> saveRestaurants(List<Restaurant> restaurant) {
    	
	LOGGER.debug("Entering into saveRestaurants method");
    	LOGGER.info("restaurants data added successfully");
        return repository.saveAll(restaurant);
    }

    public List<Restaurant> getRestaurants() {
    	LOGGER.debug("Entering into getRestaurants method");
    	LOGGER.info("restaurants data get successfully");
    	Restaurant res =new Restaurant();
   System.out.println(res.getUpdatedts());
   
        return repository.findAll();
    }

    public Restaurant getRestaurantById(int id) {
    	LOGGER.debug("Restaurant is find by id");
    
    	LOGGER.info("restaurants found By Id successfully");
        return repository.findById(id).orElse(null);
    }

    public Restaurant getRestaurantByName(String name) {
	LOGGER.debug("Restaurant is find by name");
    	
    	LOGGER.info("restaurants found By name successfully");
        return repository.findByName(name);
    }

    public String deleteRestaurant(int id) {
    	
    	LOGGER.debug("entering into restaurants delete By id ");
        repository.deleteById(id);
    	LOGGER.info("restaurants delete By id successfully");
        return "Restaurant removed !! " + id;
    }

    public Restaurant updateRestaurant(Restaurant restaurant) {
    	LOGGER.debug("entering into restaurants delete By id ");
    	
    	Restaurant existingRestaurant = repository.findById(restaurant.getId()).orElse(null);
        existingRestaurant.setName(restaurant.getName());
        existingRestaurant.setAddress(restaurant.getAddress());
        existingRestaurant.setOpentime(restaurant.getOpentime());
        existingRestaurant.setClosetime(restaurant.getClosetime());
        existingRestaurant.setPhnno(restaurant.getPhnno());
        existingRestaurant.setMenu(restaurant.getMenu());
       
      	LOGGER.info("restaurants data updated successfully");
        
        return repository.save(existingRestaurant);
    }

	


}
