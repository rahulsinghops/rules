package com.ipru.mca.bre.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ipru.mca.bre.model.BreInputDetails;
import com.ipru.mca.bre.model.BreOutputDetails;
import com.ipru.mca.bre.model.BreProperties;
import com.ipru.mca.bre.services.BreService;

import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/mca")
public class BREResource {
	@Autowired
	BreService breService;
	
	@Value("${author:pritha}")
	private String name;
	
	@Autowired
	BreProperties properties;
	
	Logger log = LoggerFactory.getLogger(BREResource.class);
	//for swagger documentation 
	@ApiOperation(value = " To get Business rules",consumes = "application/json")
	@RequestMapping(method = RequestMethod.POST,path = "/bre",consumes = "application/json",produces = "application/json")
	public ResponseEntity<?> getBreDetails(@RequestBody @Valid BreInputDetails bredetails)
	{
		
		System.out.println("name:"+ name);
		System.out.println("config prop value:"+properties.getLoggingenabled());
		log.info("getBreDetaisl called,BreInputDetaisl:"+bredetails);
		
		BreOutputDetails outputDetails=breService.getBreDetails(bredetails);
		
		log.info("getBreDetaisl response,BreOutputDetails:"+outputDetails);

		return new ResponseEntity<>(outputDetails, HttpStatus.ACCEPTED);
	}

}
