package com.company;
import java.util.Scanner;

public class Main {

    static int fib(int n){
        if(n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
	Scanner number = new Scanner(System.in);
    int n = number.nextInt();

    int fib = fib(n);
    System.out.println(fib);
    }
}
