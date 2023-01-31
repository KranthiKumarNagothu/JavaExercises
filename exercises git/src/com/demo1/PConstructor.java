package com.demo1;

public class PConstructor {
        int modelYear;
        String modelName;

        public PConstructor(int year, String name) {
            modelYear = year;
            modelName = name;
        }

        public static void main(String[] args) {
            PConstructor myCar = new PConstructor(2000, "Kranthi");
            System.out.println(myCar.modelYear + " " + myCar.modelName);
        }
    }


