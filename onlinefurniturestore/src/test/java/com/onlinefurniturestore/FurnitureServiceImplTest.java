package com.onlinefurniturestore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.onlinefurniturestore.entity.Furniture;
import com.onlinefurniturestore.exception.FurnitureServiceException;
import com.onlinefurniturestore.service.FurnitureManagementServiceInterface;

@SpringBootTest
class FurnitureServiceImplTest {

	final Logger LOGGER =	LoggerFactory.getLogger(this.getClass());

	@Autowired
	private FurnitureManagementServiceInterface furnitureService;

	@Test
	void testAddFurniture() throws FurnitureServiceException {
		Furniture furniture = new Furniture();
		furniture.setFurnitureId(4);
		furniture.setFurnitureColor("blue");
		furniture.setFurnitureModel("Wingback Chair");
		furniture.setFurnitureName("Chair");
		furniture.setPrice(123.0);
		assertEquals(furniture.getFurnitureModel(),furnitureService.registerFurniture(furniture).getFurnitureModel());
		LOGGER.info("Add exceuted");
	}
}
