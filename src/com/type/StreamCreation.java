package com.type;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {

    public static void main(String ...arg){
        System.out.println("===========using stream builder===================");
        Stream.builder().add("java").add("c").build().forEach(System.out::println);
        System.out.println("===========using stream builder===================");

        System.out.println("=============using string characters======================================");
        "springboot".chars().forEach(System.out::println);
        "springboot".chars().mapToObj(i -> (char)i).forEach(System.out::println);//string.chartAt[i]
        System.out.println("=============using string characters======================================");

        System.out.println("===============getting streams from values===========================");
        Stream<String> stream  = Stream.of("XML", "Java",  "CSS", "SQL");
        stream.forEach(System.out::println);
        System.out.println("===============getting streams from values===========================");

        System.out.println("=================getting empty stream==========================");
        //The IntStream, LongStream, and DoubleStream interfaces also contain an empty() static method to create an empty stream of primitive types
        Stream<String> emptystream  = Stream.empty();
        emptystream.forEach(System.out::println);
        System.out.println("=================getting empty stream==========================");

        System.out.println("===============getting stream from a array=================================");
        int[] arr = {1, 2};
        Stream<int[]> arr1 = Stream.of(arr);
        IntStream stream2 = Arrays.stream(arr);
        System.out.println("===============getting stream from a array=================================");

        System.out.println("==================from file=====================");
        String fileName = "/home/kavita/cds";

        //read file into stream, try-with-resources
        try (Stream<String> filestream = Files.lines(Paths.get(fileName))) {

            filestream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("==================from file=====================");

    }
}
