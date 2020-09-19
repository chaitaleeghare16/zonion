package com.SpringBoot.ZonionApplication.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.ZonionApplication.model.Restaurant;
@Repository

public interface RestaurantRepository extends JpaRepository<Restaurant,Integer> {
	Restaurant findByName(String name);
}

