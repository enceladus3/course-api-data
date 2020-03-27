package com.example.courseapidata.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	//	private List<Topic> topics = new ArrayList<>(Arrays.asList(
// 			new Topic("spring", "Spring Framework", "Spring Framework description"),
//			new Topic("java", "Java Code", "Java Core description"),
//			new Topic("javascript", "JavaScript", "JavaScript description")
//			));
//
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id) {
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id).orElse(null);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);

	}

	public void updateTopic(String id, Topic topic) {
//		for (int i = 0; i < topics.size(); i++) {
////			Topic t = topics.get(i);
//			if (topics.get(i).getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		topicRepository.save(topic);

	}

	public void deleteTopic(String id) {
//		topics.removeIf(t -> t.getId().equals(id));
		topicRepository.deleteById(id);
	}

}