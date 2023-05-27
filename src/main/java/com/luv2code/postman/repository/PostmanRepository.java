package com.luv2code.postman.repository;

import com.luv2code.postman.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostmanRepository extends CrudRepository<Student, Integer> {
    List<Student> findByFirstNameAndLastName(String firstName, String lastName);
    List<Student> findByFirstNameAndLastNameAndStatus(String firstName, String lastName, String status);
    List<Student> findByLastName(String lastName);
    List<Student> findByFirstName(String firstName);
    List<Student> findByStatus(String status);
}
