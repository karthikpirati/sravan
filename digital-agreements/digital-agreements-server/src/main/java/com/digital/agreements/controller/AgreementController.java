package com.digital.agreements.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="/agreement")
@RestController
public class AgreementController {
	
	private Logger logger=LoggerFactory.getLogger(AgreementController.class);

	@RequestMapping(value="/accept")
	public boolean validateUser(HttpServletRequest request) {
		return true;
	}
	
	@RequestMapping(value="/get")
	public boolean getAgreement(HttpServletRequest request) {
		this.logger.info(request.toString());
		return true;
	}
}
