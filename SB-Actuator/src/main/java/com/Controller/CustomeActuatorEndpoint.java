package com.Controller;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Endpoint(id = "cae")
public class CustomeActuatorEndpoint {

	@ReadOperation
	public String getInfo() {

		return "this is my custome endpoint mdg from server is : I am OK!!!";
	}
}
