package com.SpringBoot.ZonionApplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.ZonionApplication.model.Image;

public interface ImageRepository extends JpaRepository<Image,Integer>
{
	Optional<Image> findByName(String name);
}
