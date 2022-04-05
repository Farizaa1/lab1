package com.company;
import java.util.Scanner;

public class Main {

    static void minValue(int n, int[] array) {
        int min = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(min);
    }

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();

        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = number.nextInt();
        }

        minValue(n, array);
    }
}
