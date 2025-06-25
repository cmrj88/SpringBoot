package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
   StudentService ss;
    @GetMapping("std")
   public List<Students> getAllStudents(){
       return ss.readStudents();
    }
    @GetMapping("std/{id}")
    public Students getStudent(@PathVariable String id){
        return ss.readStudent(id);
    }
    @PostMapping("std")
    public void PostStudents(@RequestBody Students st){
           ss.createStudent(st);
    }
    @DeleteMapping("std/{id}")
    public boolean removeStudent(@PathVariable String id){
        return ss.deleteStudent(id);

    }
    @PutMapping("std/{id}")
    public boolean updateStudent(@RequestBody Students st){
       return ss.updateStudent(st);
    }
}
