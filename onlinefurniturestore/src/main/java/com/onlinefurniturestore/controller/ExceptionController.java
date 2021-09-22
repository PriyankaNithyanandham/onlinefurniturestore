package com.onlinefurniturestore.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.onlinefurniturestore.exception.UserNotFoundException;

@RestControllerAdvice

public class ExceptionController {
	
	@ExceptionHandler(UserNotFoundException.class)
	public String handleUserNotFound(UserNotFoundException userException) {
		return userException.getMessage();
	}

}
