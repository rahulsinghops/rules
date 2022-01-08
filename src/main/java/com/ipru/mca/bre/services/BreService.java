package com.ipru.mca.bre.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ipru.mca.bre.dao.BreRepo;
import com.ipru.mca.bre.model.BreDetails;
import com.ipru.mca.bre.model.BreInputDetails;
import com.ipru.mca.bre.model.BreOutputDetails;

@Service
public class BreService {
	
	@Autowired
	BreRepo breRepo;
	
	public BreDetails transformation(BreInputDetails input)
	{
		if(input != null)
		{
			return new BreDetails("test", 0, 0, 0, 0, null, null, null);
		}
		else
			return null;
	}
	 public BreOutputDetails getBreDetails(BreInputDetails input)
	 {
		 BreDetails details = breRepo.getBreDecision(input.getAge(), input.getAge(), input.getOffRoadFlag().toUpperCase(), input.getRoad().toUpperCase(), input.getSeaorhill().toUpperCase());
		 return new BreOutputDetails(details.getType(), input.getLowerRange(), input.getUpperRange(), HttpStatus.ACCEPTED.value()+"");
	 }

}
