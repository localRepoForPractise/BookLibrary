package com.springframework.mainservice;

import com.springframework.maincontroller.Response;

public interface MainService {

	Response checkConnection();

	Response testVariable(String testVariable);

}
