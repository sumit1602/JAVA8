package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class DemoForEach {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5);
        //external loop
        for(int i: li ){
            System.out.println(i);
        }
        //Internal loops in java 1.8
        li.forEach(i -> System.out.println(i));
    }
}
