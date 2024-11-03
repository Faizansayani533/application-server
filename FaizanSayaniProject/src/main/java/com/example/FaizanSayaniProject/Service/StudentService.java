package com.example.FaizanSayaniProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.FaizanSayaniProject.Entity.Student;
import com.example.FaizanSayaniProject.Repo.StudentRepo;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;
    public void saveorUpdate(Student students) {
        repo.save(students);


    }


    public Iterable<Student> listAll() {

        return repo.findAll();
    }


    public void deleteStudent(String _id) {
        repo.deleteById(_id);
    }

    public Student getStudentByID(String studentid) {
        return repo.findById(studentid).get();
    }
}
