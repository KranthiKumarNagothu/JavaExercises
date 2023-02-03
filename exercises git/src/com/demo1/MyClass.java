package com.demo1;
import java.util.Scanner;

public class MyClass {
        public static void main(String[] args) {
            Scanner name = new Scanner(System.in);

            Scanner x = new Scanner(System.in);
            Scanner y = new Scanner(System.in);

            System.out.println("Enter username");

            String userName = name.nextLine();
            int a = x.nextInt();
            int b = y.nextInt();
            System.out.println("Username is: " +userName);
            System.out.println("Value of 1st number: " +a);
            System.out.println("Value of 2nd number: " +b);
        }
    }

