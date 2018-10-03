package com.company;
//Find the first even number in the integer list which is greater than 3.

import java.util.Arrays;
import java.util.List;

public class Q6 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,1,1,1,1,1,7,7,7,7,8);
        System.out.println("first even number in the integer list which is greater than 3 is: ");
        System.out.println(li.stream().filter(i-> i>3).filter(i -> i%2==0).findFirst());
    }
}
