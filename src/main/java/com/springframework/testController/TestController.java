package com.springframework.testController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.maincontroller.Response;
import com.springframework.mainservice.MainService;

@RestController
public class TestController {

	@Autowired
	@Qualifier("mainService")
	private MainService mainService;
	
	@RequestMapping(value = "/testVariable", method = RequestMethod.POST)
	@ResponseBody
	public Response testVariable(@RequestBody String testVariable) {
		//logger.info("Processing request from Class : MainController, Method: checkConnection");
		Response response = mainService.testVariable(testVariable);
		if (response.getCode().equalsIgnoreCase("200"))
			response.setResponse("200", "SUCCESS", "SUCCESS");
		else
			response.setResponse("500", "FAILURE", "FAILURE");
		return response;
	}
}
