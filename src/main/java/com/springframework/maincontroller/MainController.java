package com.springframework.maincontroller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.mainservice.MainService;

@RestController
public class MainController {

	@Autowired
	@Qualifier("mainService")
	private MainService mainService;

	private static final Logger logger = Logger.getLogger(MainController.class);
	
	@RequestMapping(value = "/checkConnection", method = RequestMethod.GET)
	@ResponseBody
	public Response checkConnection() {
		logger.info("Processing request from Class : MainController, Method: checkConnection");
		Response response = mainService.checkConnection();
		return response;
	}
}
