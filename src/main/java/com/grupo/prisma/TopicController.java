package com.grupo.prisma;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	
	@RequestMapping("/hello")
	public String sayHi() {		
		return "Hi";
	}	
}
