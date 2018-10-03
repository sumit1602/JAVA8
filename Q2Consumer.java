package com.company;
// Implement following functional interfaces from java.util.functionusing lambdas:
//
//         Consumer
//
//         Supplier
//
//         Predicate
//
//         Function


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Q2 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,5,6,7);
//        Consumer<Integer> c = new Consumer<Integer>()
//        {
//            public  void accept(Integer i)
//            {
//                System.out.println(i);
//            }
//        };
        Consumer<Integer> c = (i) -> System.out.print(i+" ");
        li.forEach(c);
    }
}

