package com.springframework.loginController;

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
public class LoginController {

	@Autowired
	@Qualifier("mainService")
	private MainService mainService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Response testVariable(@RequestBody Login login) {
		//logger.info("Processing request from Class : MainController, Method: checkConnection");
		//Login login = new Login(username, "sad");
		Response response = mainService.submitLoginDetails(login);
		if (response.getCode().equalsIgnoreCase("200"))
			response.setResponse("200", "SUCCESS", "SUCCESS");
		else
			response.setResponse("500", "FAILURE", "FAILURE");
		return response;
	}
}
