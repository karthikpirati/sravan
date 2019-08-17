package jnet.agreement.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/agreement")
@CrossOrigin("*")
public class AgreementController {
	
		private static final Logger logger=LoggerFactory.getLogger(AgreementController.class);

		@GetMapping(value="/user")
		public void searchUser() {
			logger.info("search user called");
		}
}
