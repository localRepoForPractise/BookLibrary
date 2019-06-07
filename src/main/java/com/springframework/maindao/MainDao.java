package com.springframework.maindao;

import com.springframework.maincontroller.Response;

public interface MainDao {

	public Response checkConnection();
	
	Response testVariable(String testVariable);
}
