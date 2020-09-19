package com.SpringBoot.ZonionApplication.controller;


import com.SpringBoot.ZonionApplication.model.Restaurant;
import com.SpringBoot.ZonionApplication.service.RestaurantService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService service;

    @PostMapping("/addRestaurant")
    public Restaurant addProduct(@RequestBody Restaurant restaurant) {
        return service.saveRestaurant(restaurant);
    }

    @PostMapping("/addRestaurants")
    public List<Restaurant> addProducts(@RequestBody List<Restaurant> restaurant) {
        return service.saveRestaurants(restaurant);
    }

    @GetMapping("/restaurants")
    public List<Restaurant> findAllProducts() {
        return service.getRestaurants();
    }

    @GetMapping("/restaurantById/{id}")
    public Restaurant findProductById(@PathVariable int id) {
        return service.getRestaurantById(id);
    }

    @GetMapping("/restaurant/{name}")
    public Restaurant findProductByName(@PathVariable String name) {
        return service.getRestaurantByName(name);
    }

    @PutMapping("/update")
    public Restaurant updateProduct(@RequestBody Restaurant restaurant) {
        return service.updateRestaurant(restaurant);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteRestaurant(id);
    }
}
