package com.group13.project3.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

		private List<Topic> topics = new ArrayList<Topic>( Arrays.asList(
				
				new Topic("Spring", "Spring Framework", "Spring Framework description"),
				new Topic("Java", "Core java", "Core Java Description"),
				new Topic("Javascript", "Javascript", "Javascript Description")
			
	));
		
	public List<Topic> getAllTopics(){
		
		return this.topics;
	}
	
	public Topic getTopic(String id) {
		
			return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
			
		
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	public void updateTopic(Topic topic, String id) {
		// TODO Auto-generated method stub
		for(int i =0; i< topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
		return;
	}
}
