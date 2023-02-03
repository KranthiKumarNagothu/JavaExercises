package com.demo1;

public class variables {
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String args[]) {
        variables variable = new variables();
        variable.pupAge();
    }
}
