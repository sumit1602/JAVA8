package com.company;

import javax.naming.CompositeName;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//public class consumer implements Consumer<Integer> {
////    public void accept(Integer i){
////        System.out.println(i);
////    }
//}
class abcd {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,5,6,7);
//        Consumer<Integer> c = new Consumer<Integer>()
//        {
//            public  void accept(Integer i)
//            {
//                System.out.println(i);
//            }
//        };
        Consumer<Integer> c = (i) -> System.out.println(i);
        li.forEach(c);
    }
}