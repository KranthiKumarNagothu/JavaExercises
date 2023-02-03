package com.demo1;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriterExample {

    public static void main(String args[]){
        try {
            FileWriter fw = new FileWriter("C:/Users/Kranthi Chowdary/Desktop/Filewriter.txt");
            fw.write("Welcome to Java Learning with Nexturn Private Limited. ");
            fw.close(); //To remove the unused memory.
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("FileWrite is Successfull....");
    }
}