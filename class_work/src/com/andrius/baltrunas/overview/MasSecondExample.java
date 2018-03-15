package com.andrius.baltrunas.overview;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 3/14/2018.
 */
public class MasSecondExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mas = {};
        int value = -1;
        int i = 0;
        while (value != 0) {
            System.out.println("Iveskite skaiciu nuo 1 iki 10, noredami baigti iveskite 0");
            value = scanner.nextInt();

            if (value > 0 && value <= 10) {
                if (mas.length == i) {
                    mas = Arrays.copyOf(mas, mas.length + 1);
                }
                mas[i] = value;
                i++;
            }
        }

        for (Integer a : mas){
            System.out.println(a);
        }
    }

}
