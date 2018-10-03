package com.company;

interface phone{
    void call();
    default void message(){
        System.out.println("message sent");
    }
}
class AndroidPhone implements phone{
    @Override
    public void call() {
        System.out.println("calling");
    }
}
public class LambdaExample {
    public static void main(String[] args) {
        phone obj = new AndroidPhone();
        obj.call();
        obj.message();
    }
}
