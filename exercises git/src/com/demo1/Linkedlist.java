package com.demo1;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
        public static void main(String args[]) {
            List<String> list1 = new LinkedList<>();
            list1.add("Kranthi");
            list1.add("Kumar");
            list1.add("Maruthi");
            list1.add("Yashwanth");

            System.out.println(list1);
            System.out.println("Index of Kumar: " +list1.indexOf("Kumar"));
            System.out.println("Does the list contain Kranthi?  " +list1.contains("Kranthi"));
            System.out.println("Removing Kranthi from the list: " +list1.remove(0));
            System.out.println(list1);
            System.out.println("The List is Empty: " +list1.isEmpty());


        }
    }

