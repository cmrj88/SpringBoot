package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    ArrayList<Students> sl=new ArrayList<>();//Databse
    @Override
    public void createStudent(Students st) {

        sl.add(new Students(st.getSname(),st.getAge(),st.getMno()));
    }

    @Override
    public List<Students> readStudents() {

        return sl;
    }

    @Override
    public Students readStudent(String name) {
        Students s=null;
        for(Students x:sl){
            if(x.getSname().equals(name)) {
                s = x;
            }
        }
        return s;
    }

    @Override
    public boolean deleteStudent(String name) {
       for(Students x:sl)
           if(x.getSname().equals(name)) {
               sl.remove(x);
               return true;
           }
       return false;
    }

    @Override
    public boolean updateStudent(Students st) {
        Iterator<Students> itr= sl.iterator();
        while(itr.hasNext()){
            Students s=itr.next();
            if(s.getSname().equals(st.getSname())){
//                s.setAge(st.getAge());
//                s.setMno(st.getMno());
                sl.set(sl.indexOf(s),st);
                return true;
            }
        }
        return false;
    }
}
