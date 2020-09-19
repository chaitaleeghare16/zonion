package com.SpringBoot.ZonionApplication.service;

import com.SpringBoot.ZonionApplication.model.Restaurant;
import com.SpringBoot.ZonionApplication.repository.RestaurantRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    private RestaurantRepository repository;

    public Restaurant saveRestaurant(Restaurant restaurant) {
        return repository.save(restaurant);
    }

    public List<Restaurant> saveRestaurants(List<Restaurant> restaurant) {
        return repository.saveAll(restaurant);
    }

    public List<Restaurant> getRestaurants() {
        return repository.findAll();
    }

    public Restaurant getRestaurantById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Restaurant getRestaurantByName(String name) {
        return repository.findByName(name);
    }

    public String deleteRestaurant(int id) {
        repository.deleteById(id);
        return "Restaurant removed !! " + id;
    }

    public Restaurant updateRestaurant(Restaurant restaurant) {
    	Restaurant existingRestaurant = repository.findById(restaurant.getId()).orElse(null);
        existingRestaurant.setName(restaurant.getName());
        existingRestaurant.setAddress(restaurant.getAddress());
        existingRestaurant.setOpentime(restaurant.getOpentime());
        existingRestaurant.setClosetime(restaurant.getClosetime());
        existingRestaurant.setPhnno(restaurant.getPhnno());
        existingRestaurant.setMenu(restaurant.getMenu());
        
        return repository.save(existingRestaurant);
    }


}
