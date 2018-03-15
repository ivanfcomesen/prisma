package com.grupo.prisma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

//	public List<Topic> topics = new ArrayList<>(Arrays.asList(
	///		new Topic("spring", "Spring Framework", "Spring Framework Description"),
		//	new Topic("java", "Core Java", "Core Java Description"), 
			//new Topic("javascript", "JavaScript", "JavaScript Description")));

	public List<Topic> getAllTopics() {
		
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id) {
		// topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {

		/*for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {				
				topics.set(i,topic);						
				return;
		
			}
		}*/
		topicRepository.save(topic);
		
	}
	
	public void deleteTopic(String id) {		
	//	topics.removeIf(t -> t.getId().equals(id));
	topicRepository.delete(id);	
		
	}

}
