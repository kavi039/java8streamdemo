package com.lazyEvaluation;

import com.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//not wait to filter whole list cascading pattern
public class PerformanceOptimization {
    public static void main(String ...arg){

        List<Student> students=new ArrayList<>();
        for (int i=0;i<=5;i++){
            Student student=new Student();
            student.setName("stu"+i);
            student.setRollno(i+79);
            students.add(student);
        }
        List<String> ids = students.stream()
                .filter(s -> {System.out.println("filter - "+s); return s.getRollno() > 2;})
                .map(s -> {System.out.println("map - "+s); return s.getName();})
                .limit(3)
                .collect(Collectors.toList());
    }
}
