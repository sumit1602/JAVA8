package com.company;

import java.util.function.Predicate;

public class prdeicate {
    public static void main(String[] args) {
        //creating predicate
        Predicate<Integer> lesserthan= (i) -> (i<17);
        //calling predicate
        System.out.println(lesserthan.test(10));

        Predicate<Integer> large = i -> (i<20);
        Predicate<Integer> small = i -> (i>10);

        boolean result = large.and(small).test(15);
        System.out.println(result);

        boolean result2 = large.and(small).negate().test(15);
        System.out.println(result2);
        pred(10, i -> i>7);

    }
    static void pred(int number, Predicate<Integer> predicate){
        if(predicate.test(number)){
            System.out.println(number);
        }
    }
}

