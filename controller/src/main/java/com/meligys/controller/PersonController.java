package com.meligys.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.meligys.dto.PersonResponseDto;

@RestController
@RequestMapping("/persons")
public class PersonController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<PersonResponseDto> get() {
		return null;
		
	}

}
