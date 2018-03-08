package com.grupo.prisma;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
	
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {		
		
		return Arrays.asList(
			new Topic("spring","Spring Framework","Spring Framework Description"),
			new Topic("java","Java Framework","Java Framework Description"),	
			new Topic("jascript","JS","Jsdes"));
				
	}	
}
