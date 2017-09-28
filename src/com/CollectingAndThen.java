package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectingAndThen {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Double result = list.stream().collect(Collectors.collectingAndThen(Collectors.averagingLong(v->v),
                s-> s*s));
        System.out.println(result);
    }
}
