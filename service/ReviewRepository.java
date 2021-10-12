package com.onlinefurniture.service;

import org.springframework.data.repository.CrudRepository;

import com.onlinefurniture.domain.Review;

public interface ReviewRepository extends CrudRepository<Review,Long> {
}
