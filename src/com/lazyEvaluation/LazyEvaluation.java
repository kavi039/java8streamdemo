package com.lazyEvaluation;

import com.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluation {
    public static void main(String[] args) throws Exception{
        List<Student> students=new ArrayList<>();
        for (int i=0;i<=5;i++){
            Student student=new Student();
            student.setName("stu"+i);
            student.setRollno(i+79);
            students.add(student);
        }
        //Created a Stream of a Students List
//attached a map operation on it
        Stream<String> streamOfNames = students.stream()
                .map(student -> {
                    System.out.println("In Map - " + student.getName());
                    return student.getName();
                });
//Just to add some delay
        for (int i = 1; i <= 5; i++) {
            Thread.sleep(1000);
            System.out.println(i + " sec");
        }
//Called a terminal operation on the stream
        streamOfNames.collect(Collectors.toList());
    }
}
