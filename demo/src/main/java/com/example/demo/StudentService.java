package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
              void createStudent(Students st);
              List<Students> readStudents();
              Students readStudent(String name);
              boolean updateStudent(String name, Students st);
              boolean deleteStudent(String name);
}
