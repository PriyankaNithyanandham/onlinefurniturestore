package com.service;

import java.util.List;

import com.entity.Furniture;

public interface FurnitureManagementService {
	List<Furniture> getAllFurnitures();
	Furniture getFurnitureById(int furnitureId);
	Furniture registerFurniture(Furniture furniture);
	Furniture updateFurniture(Furniture furniture);
	Furniture updateFurnitureById(int furnitureId);
	String deleteFurniture(Furniture furniture);
	String deleteFurnitureById(int furnitureId);

}
