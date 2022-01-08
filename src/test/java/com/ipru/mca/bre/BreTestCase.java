package com.ipru.mca.bre;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.ipru.mca.bre.dao.BreRepo;
import com.ipru.mca.bre.model.BreDetails;
import com.ipru.mca.bre.model.BreInputDetails;
import com.ipru.mca.bre.services.BreService;

@SpringBootTest
public class BreTestCase {
	@Autowired
	BreService breService;

	@MockBean
	BreRepo breRepo;

	Logger log = LoggerFactory.getLogger(BreTestCase.class);

	@Test
	public void cruiserTest() {
		BreInputDetails input = new BreInputDetails();
		input.setAge(40);
		input.setLowerRange(1000000);
		input.setOffRoadFlag("Y");
		input.setRoad("HIGHWAY");
		input.setSeaorhill("HILL");
		input.setUpperRange(10000000);
		when(breRepo.getBreDecision(40, 40, "Y", "HIGHWAY", "HILL"))
				.thenReturn(new BreDetails("CRUISER", 30, 60, 100000, 1000000, "HIGHWAY", "Y", "HILL"));
		assertEquals("CRUISER", breService.getBreDetails(input).getType());
	}

	@Test
	public void scooterTest() {
		BreInputDetails input = new BreInputDetails();
		input.setAge(60);
		input.setLowerRange(1000000);
		input.setOffRoadFlag("Y");
		input.setRoad("HIGHWAY");
		input.setSeaorhill("HILL");
		input.setUpperRange(10000000);
		when(breRepo.getBreDecision(60, 60, "Y", "HIGHWAY", "HILL"))
				.thenReturn(new BreDetails("SCOOTER", 30, 60, 100000, 1000000, "HIGHWAY", "Y", "HILL"));
		log.info(breRepo.getBreDecision(60, 60, "Y", "HIGHWAY", "HILL").toString() + "---");
		log.info(breService.getBreDetails(input).getType());
		assertEquals("SCOOTER", breService.getBreDetails(input).getType());
	}

}
