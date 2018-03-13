package com.prisma.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prisma.dao.TopicRepository;
import com.prisma.model.Topic;

@Service
public class TopicService {
	
	//@Autowired
	//private TopicRepository topicRepository;

	public List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Core Java", "Core Java Description"), 
			new Topic("javascript", "JavaScript", "JavaScript Description")));

	public List<Topic> getAllTopics() {
		return topics;
		//List<Topic> topics = new ArrayList<>();
	///	topicRepository.findAll().forEach(topics::add);
	//	retu
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {

		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {				
				topics.set(i,topic);						
				return;
			}
		}
	}
	
	public void deleteTopic(String id) {
		
		topics.removeIf(t -> t.getId().equals(id));
	}

}
