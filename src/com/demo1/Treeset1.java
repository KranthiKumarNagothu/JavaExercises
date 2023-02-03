package com.demo1;
import java.util.*;

public class Treeset1 {
        public static void main(String args[]){
            TreeSet<String> set=new TreeSet<String>();
            set.add("A");
            set.add("B");
            set.add("C");
            set.add("D");
            set.add("E");
            System.out.println("Initial Set: "+set);

            System.out.println("Reverse Set: "+set.descendingSet());

            System.out.println("Head Set: "+set.headSet("D"));

            System.out.println("SubSet: "+set.subSet("A", "E"));

            System.out.println("TailSet: "+set.tailSet("C"));

            System.out.println("" +set.add("A"));
            System.out.println((set));


        }
    }