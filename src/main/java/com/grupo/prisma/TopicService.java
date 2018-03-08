package com.grupo.prisma;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	public List<Topic> topics = Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Java Framework", "Java Framework Description"), new Topic("jascript", "JS", "Jsdes"));

	public List<Topic> getAllTopics() {
		return topics;
	}

}
