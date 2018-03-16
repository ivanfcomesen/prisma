package com.grupo.prisma.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.grupo.prisma.model.Topic;


@Repository
public interface TopicRepository extends MongoRepository<Topic, String> {

}
