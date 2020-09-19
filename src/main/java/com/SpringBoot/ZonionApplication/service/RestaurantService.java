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

    public Restaurant saveProduct(Restaurant restaurant) {
        return repository.save(restaurant);
    }

    public List<Restaurant> saveProducts(List<Restaurant> restaurant) {
        return repository.saveAll(restaurant);
    }

    public List<Restaurant> getProducts() {
        return repository.findAll();
    }

    public Restaurant getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Restaurant getProductByName(String name) {
        return repository.findByName(name);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "Restaurant removed !! " + id;
    }

    public Restaurant updateProduct(Restaurant restaurant) {
    	Restaurant existingRestaurant = repository.findById(restaurant.getId()).orElse(null);
        existingRestaurant.setName(restaurant.getName());
        
        return repository.save(existingRestaurant);
    }


}
