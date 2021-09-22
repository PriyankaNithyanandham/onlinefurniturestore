package com.service;

import java.util.List;

import com.entity.Review;

public interface CustomerFeedbackService {
	
	List<Review> getAllReviews();
	
	int getReviewByreviewRating(int reviewRating);

}
