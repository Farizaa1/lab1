package com.company;
import java.util.Scanner;

public class Main {

    static void average(int n, int[] array) {
        float c = 0;

        for(int i = 0; i < n; i++){
            c = c + array[i];
        }

        System.out.println(c/n);
    }

    public static void main(String[] args) {
	// write your code here
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();

        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = number.nextInt();
        }

        average(n, array);
    }
}
