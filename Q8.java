package com.company;

import java.io.*;
//Q8. Read and Write data using buffered input and ouput stream.
public class Q8 {
    public static void main(String[] args) throws Exception {

        // Writing data to specified location
//       BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/home/sumit/bufferedTest"));
  FileOutputStream fileOutputStream = new FileOutputStream("/home/sumit/Desktop/sss/Buffer1.txt");
  BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

         byte b[]={1,2,3,4,5,6,7,8,9};
         bufferedOutputStream.write(b);

         for (int i=0; i<5; i++){
             bufferedOutputStream.write(i);
         }

         bufferedOutputStream.flush();
         bufferedOutputStream.close();

         //Readind data from given location

FileInputStream fileInputStream= new FileInputStream("/home/sumit/Desktop/sss/Buffer1.txt");
BufferedInputStream bufferedInputStream= new BufferedInputStream(fileInputStream);
//        int i=0;
        int cl;
        //This method blocks until input data is available
        while((cl=bufferedInputStream.read())!=-1)
        {
            System.out.println((int) cl);
        }

        }
    }

