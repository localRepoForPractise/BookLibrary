package com.springframework.mainservice;

import com.springframework.loginController.Login;
import com.springframework.maincontroller.Response;

public interface MainService {

	Response checkConnection();

	Response testVariable(String testVariable);
	
	Response submitLoginDetails(Login login);

}
