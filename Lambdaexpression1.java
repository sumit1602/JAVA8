package com.company;
interface A{
    void show();
}
class xyz implements A{
    public void show(){
        System.out.println("hello");
    }
}
public class Lambdaexpression1 {
    public static void main(String[] args) {
       A obj;
       obj=new xyz();
       obj.show();
    }
}
