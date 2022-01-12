package com.example.rakib.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.rakib.service.UserService;
import com.example.rakib.spring.GetUserRequest;
import com.example.rakib.spring.GetUserResponse;

@Endpoint
public class UserEndpoint {

	@Autowired
	private UserService userService;
	
	@PayloadRoot(namespace = "http://rakib.example.com/spring.example",
			localPart = "getUserRequest"
			)
	@ResponsePayload
	public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request){
		GetUserResponse response = new GetUserResponse();
		response.setUser(userService.getUser(request.getName()));
		return response;
	}
}
