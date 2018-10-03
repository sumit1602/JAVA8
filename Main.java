package com.company;
interface I{
   default void show(){
       System.out.println("I");
    }

    static void show1(){
        System.out.println("static method is interface I");
    }
}
interface J{
   default void show(){
       System.out.println("J");
    }
//    default boolean equals(Object o){
//       return true;
//    }

    static void show1(){
        System.out.println("static method is interface J");
    }
}
class Main {

  public void show(){
      System.out.println("main");
  }

}
class C extends Main implements I,J{
    public static void main(String[] args) {
        C obj = new C();
//        void show(){
//            System.out.println("C");
//        }
//        obj.show();
        I.show1();


    }
}