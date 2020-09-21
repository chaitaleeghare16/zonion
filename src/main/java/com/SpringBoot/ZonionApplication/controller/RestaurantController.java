package com.SpringBoot.ZonionApplication.controller;


import com.SpringBoot.ZonionApplication.model.Restaurant;
import com.SpringBoot.ZonionApplication.service.RestaurantService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class RestaurantController {
	private static final Logger LOGGER = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private RestaurantService service;

    @PostMapping("/addRestaurant")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
      	LOGGER.info("inside restaurant controller");
        return service.saveRestaurant(restaurant);
    }

    @PostMapping("/addRestaurants")
    public List<Restaurant> addRestaurants(@RequestBody List<Restaurant> restaurant) {
    	LOGGER.info("inside restaurant controller");
        return service.saveRestaurants(restaurant);
    }

    @GetMapping("/restaurants")
    public List<Restaurant> findAllRestaurant() {
    	LOGGER.info("inside restaurant controller");
        return service.getRestaurants();
    }

    @GetMapping("/restaurantById/{id}")
    public Restaurant findRestaurantById(@PathVariable int id) {
    	System.out.println("id from url"+id);
    	LOGGER.info("inside restaurant controller");
        return service.getRestaurantById(id);
    }

    @GetMapping("/restaurant/{name}")
    public Restaurant findRestaurantByName(@PathVariable String name) {
    	LOGGER.info("inside restaurant controller");
        return service.getRestaurantByName(name);
    }

    @PutMapping("/update")
    public Restaurant updateRestaurant(@RequestBody Restaurant restaurant) {
    	LOGGER.info("inside restaurant controller");
        return service.updateRestaurant(restaurant);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteRestaurant(@PathVariable int id) {
    	LOGGER.info("inside restaurant controller");
        return service.deleteRestaurant(id);
    }
    
   
}
