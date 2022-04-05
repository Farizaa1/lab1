package com.company;
import java.util.Scanner;

public class Main {

    static void prime(int n){
        if(n % 2 == 0){
            System.out.println("Composite");
        }
        else{
            System.out.println("Prime");
        }
    }

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();

        prime(n);
    }
}
