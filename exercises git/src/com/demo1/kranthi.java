package com.demo1;

public class kranthi {
    public int add(int a, int b){
        return a+b;

    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public static void main (String[] args) {
        kranthi art = new kranthi();

        System.out.println("Addition of 5 and 10 is" +art.add(5,10));
        System.out.println("Subtraction of 5 and 10 is"+art.sub(5, 10));
        System.out.println("Multiplication of 5 and 10 is"+art.mul(5, 10));
        System.out.println("Division of 5 and 10 is"+art.div(5, 10));
    }
}
