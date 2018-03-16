package com.grupo.prisma.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo.prisma.dao.TopicRepository;
import com.grupo.prisma.model.Topic;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics() {

		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		topics = topicRepository.findAll();
		return topics;
	}

	public Topic getTopic(String id) {
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);

	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);

	}

}
