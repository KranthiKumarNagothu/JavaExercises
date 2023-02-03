package com.demo1;
import java.io.*;
import java.io.ObjectOutputStream;
public class Serializationdemo {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            Student s1 =new Student(211, "Kranthi");
            FileOutputStream fout = new FileOutputStream("C:\\JavaDemo\\kranthi\\kranth\\src\\com\\demo1\\textoutput.txt");
            ObjectOutputStream out =new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("success");

        }
        catch(Exception exe){
            System.out.println(exe.getMessage());

        }
    }
}
