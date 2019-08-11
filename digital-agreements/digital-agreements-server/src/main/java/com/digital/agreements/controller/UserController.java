package com.digital.agreements.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="/user")
@RestController
public class UserController {
	
	@RequestMapping(value="/validate")
	public boolean validateUser(HttpServletRequest request) {
		return true;
	}

}
