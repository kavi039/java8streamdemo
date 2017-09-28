package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

    public static void main(String[] args) {

        List<Student> students=new ArrayList<>();
        for (int i=0;i<=5;i++){
            Student student=new Student();
            student.setName("stu"+i);
            student.setRollno(i+79);
            students.add(student);
        }
        students.stream()
                .map(Student::getName)
                .sorted()
                .collect(Collectors.toList()).forEach(System.out::println);
        students.stream()
                .map(Student::getName)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()).forEach(System.out::println);;

    }
}
