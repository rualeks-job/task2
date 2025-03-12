package org.example.practicalWork2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Double> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(random.nextDouble());
        }
        mergeSort(a);
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
    }

    public static void mergeSort(ArrayList<Double> list) {
        if (list.size() > 1) {
            int mid = list.size() / 2;
            ArrayList<Double> left = new ArrayList<>(list.subList(0, mid));
            ArrayList<Double> right = new ArrayList<>(list.subList(mid, list.size()));
            mergeSort(left);
            mergeSort(right);
            int j = 0;
            int i = 0;
            int k = 0;
            while (i < left.size() && j < right.size()) {
                if (left.get(i) > right.get(j)) {
                    list.set(k++, right.get(j++));
                } else {
                    list.set(k++, left.get(i++));
                }
            }
            while (i < left.size()) {
                list.set(k++, left.get(i++));
            }
            while (j < right.size()) {
                list.set(k++, right.get(j++));
            }
        }
    }
}
