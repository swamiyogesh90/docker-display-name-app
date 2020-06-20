package com.docker.example.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerRestController {
	
	@RequestMapping(value="/displayName", method=RequestMethod.GET)
	public String displayName(@PathParam("name") String name) {
		
		return "Hello " + name + "..!";
	}

}
