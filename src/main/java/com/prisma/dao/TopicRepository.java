package com.prisma.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.prisma.model.Topic;


@Repository
public interface TopicRepository extends MongoRepository<Topic, String> {

}
