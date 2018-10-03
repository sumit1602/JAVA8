package com.company;

import java.util.Arrays;
import java.util.List;

//Collect all the even numbers from an integer list.

public class Q3 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5);
        li.stream().filter(i ->(i%2==0)).forEach(System.out::println);
//        for(int i: li ){
//            if(i%2==0){
//                System.out.print(i+" ");
//            }
//        }

    }
}
