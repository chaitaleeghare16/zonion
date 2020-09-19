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
        return service.saveProduct(restaurant);
    }

    @PostMapping("/addRestaurants")
    public List<Restaurant> addProducts(@RequestBody List<Restaurant> restaurant) {
        return service.saveProducts(restaurant);
    }

    @GetMapping("/restaurants")
    public List<Restaurant> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/restaurantById/{id}")
    public Restaurant findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/restaurant/{name}")
    public Restaurant findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }
//
//    @PutMapping("/update")
//    public Restaurant updateProduct(@RequestBody Restaurant restaurant) {
//        return service.updateProduct(restaurant);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public String deleteProduct(@PathVariable int id) {
//        return service.deleteProduct(id);
//    }
}
