package com.company;
//Q5. Find average of the number inside integer list after doubling it.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q5 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(6,6);
        System.out.println(li.stream().mapToInt(e->e*e).average());
    }
}
