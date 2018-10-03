package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//(4) Sum all the numbers greater than 5 in the integer list.

public class Q4 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,99);
        System.out.println(li.stream().filter(e->e > 5).mapToInt(e->e).sum());

        }
    }


//steam()---for taking element one by one from list

//filter()---filter elements by condition

//mapToInt()---converting map to int values

//sum()----sum all the element