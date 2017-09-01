package com.ggk.rules.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RulesServiceController {

	private static Log LOGGER = LogFactory.getLog(RulesServiceController.class);

	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public String validateApplication() {
		return "Hello Rule";
	}

}
