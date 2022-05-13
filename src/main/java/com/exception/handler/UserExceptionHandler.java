package com.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.exception.BookingNotFoundException;
import com.exception.UserExistsException;
import com.exception.*;

@ControllerAdvice
public class UserExceptionHandler {
	@ExceptionHandler(value=UserNotFoundException.class)
	public ResponseEntity<String> userNotFoundExceptionHandler(UserNotFoundException ex){
		return new ResponseEntity<String>("User Not Found",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=UserExistsException.class)
	public ResponseEntity<String> userNotExistExceptionHandler(UserExistsException ex){
		return new ResponseEntity<String>("User already exists",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=BookingNotFoundException.class)
	public ResponseEntity<String> bookingNotFoundExceptionHandler(BookingNotFoundException ex){
		return new ResponseEntity<String>("No such booking exists.",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=LocationNotFoundException.class)
	public ResponseEntity<String> locationNotFoundExceptionHandler(LocationNotFoundException ex){
		return new ResponseEntity<String>("No such location exists.",HttpStatus.NOT_FOUND);
	}
	
	
	

}
