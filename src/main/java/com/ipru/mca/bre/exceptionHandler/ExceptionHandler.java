package com.ipru.mca.bre.exceptionHandler;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.ipru.mca.bre.model.ExceptionBO;

@ControllerAdvice   
public class ExceptionHandler {
	
	Logger log = LoggerFactory.getLogger(ExceptionHandler.class);
	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public ResponseEntity<?> globalHandler(Exception e)
	{
		log.error("error occured,Message:"+e.getMessage() +e.getStackTrace());
	 	ExceptionBO exception = new ExceptionBO(new Date(), e.getMessage(), HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS.toString());
	 	
	 	return new ResponseEntity<>(exception, HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
	}

	
	@org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> validationHandler(MethodArgumentNotValidException e)
	{
		log.error("error occured,Message:"+e.getMessage() +e.getStackTrace());
	 	ExceptionBO exception = new ExceptionBO(new Date(), e.getBindingResult().getFieldError().getDefaultMessage(), HttpStatus.BAD_REQUEST.toString());
	 	
	 	return new ResponseEntity<>(exception, HttpStatus.BAD_REQUEST);
	}	
}
