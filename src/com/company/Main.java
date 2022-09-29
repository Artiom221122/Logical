package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        boolean answer = (a == b) && (a != c);
        System.out.println(answer);

        if ((a == b) && (a != c)) System.out.println("true");
        else System.out.println("false");
    }
}