package com.company;

//interface Cal{
//    boolean greater(int a, int b);
//    String concat(String a, String b);
//    int increment(int a);
//    String toUpperCase(String a);
//}
//
//public class Q1FunctionalInterface{
//    public static void main(String[] args){
//
//       Cal c= new Cal() {
//           @Override
//           public boolean greater(int a, int b) {
//               return a>b;
//           }
//
//           @Override
//           public int increment(int a) {
//               return ++a;
//           }
//
//           @Override
//           public String concat(String a, String b){
//               return a+b;
//           }
//           @Override
//           public String toUpperCase(String a){
//               return a.toUpperCase();
//           }
//
//       };
//        System.out.println(c.greater(8,9));
//        System.out.println(c.increment(9));
//        System.out.println(c.concat("sumit","sumit"));
//        System.out.println(c.toUpperCase("sumit"));
//
//    }
//}

@FunctionalInterface

interface A1{
    boolean greater(int a, int b);
}
interface B1{
    String concat(String a, String b);
}
interface C1{
    int increment(int a);
}
interface D1{
    String toUpperCase(String a);
}

class Q1FunctionalInterface{
    public static void main(String[] args) {
        A1 obj1= (a,b)-> a>b;
        B1 obj2= (a,b)-> a+b;
        C1 obj3= a -> ++a;
        D1 obj4= a -> a.toUpperCase();
        System.out.println(obj1.greater(1,2));
        System.out.println(obj2.concat("sumit","chaudhary"));
        System.out.println(obj3.increment(8));
        System.out.println(obj4.toUpperCase("sumit"));

    }
}