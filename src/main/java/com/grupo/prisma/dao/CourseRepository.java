package com.grupo.prisma.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.grupo.prisma.model.Course;


@Repository
public interface CourseRepository extends MongoRepository<Course, String> {

}
