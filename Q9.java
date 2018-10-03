package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Q9 {
    public static void main(String[] args) throws Exception{
//        try{
//
//        }
//       catch (FileNotFoundException e){};
        FileOutputStream v = new FileOutputStream("/home/sumit/Desktop/sss/11example.txt");
        PrintStream printStream= new PrintStream(v);
        printStream.println(6);
        printStream.print("dndjkdk");
        printStream.close();
        v.close();
        System.out.println("File is created on your path ...Please check your folder");



    }
}
