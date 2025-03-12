package org.example.practicalwork2;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt();
            if (abs(max) < abs(a[i])) {
                max = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Максимальное по модулю число: " + max);
    }
}
