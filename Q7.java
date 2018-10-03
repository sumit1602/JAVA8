package com.company;
//(7) Perform Serialization and Deserialization of an Object.

import java.io.*;

class Z implements Serializable{
    int a=10;
   final int b=20;
   static int c=30;   //direct calling
   transient int d=50; //not serializable

}
public class Q7{
    public static void main(String[] args) throws Exception{
        Z obj = new Z();


        // Java FileOutputStream is an output stream used for writing data to a file.
        FileOutputStream fos = new FileOutputStream("/home/sumit/Desktop/java.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.write(3);
        oos.writeObject(obj);

        FileInputStream fis= new FileInputStream("/home/sumit/Desktop/java.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Z z1=(Z)ois.readObject();
        System.out.println(z1.a +" "+ z1.b+" "+ z1.c+" "+ z1.d);
    }
}
