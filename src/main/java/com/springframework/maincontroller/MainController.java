package com.springframework.maincontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping(value="/checkConnection",method=RequestMethod.GET)
	@ResponseBody
    public Response checkConnection()
    {
		Response response = new Response();
		response.setResponse("200", "SUCCESS", "SUCCESS");
		System.out.println("********MAIN CONTROLLER******");
        return response;
    }
}
