package com.example.FaizanSayaniProject.Repo;

import com.example.FaizanSayaniProject.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student, String> {

}
