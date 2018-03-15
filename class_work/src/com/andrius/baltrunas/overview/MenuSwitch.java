package com.andrius.baltrunas.overview;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 3/14/2018.
 */
public class MenuSwitch {

    public static void main(String[] args) {

        System.out.println("1 - Suma \n2 - Skirtumas \n3 - Sandauga\n");

        Scanner sc = new Scanner(System.in);
        int inputas = gautiGeraSkaiciu(sc);

        switch (inputas) {
            case 1:
                suma(sc);
                break;
            case 2:
                System.out.println("Skirtumas =" + skirtumas(sc));
                break;
            case 3:
                System.out.println("Sandauga =" + sandauga(sc));
                break;
            default:
                System.out.println("Nesamone ivedei");
                break;
        }
    }

    private static int gautiGeraSkaiciu(Scanner sk) {
        int a;
        while (true) {
            try {
                a = sk.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Man rodos tai ne skaicius bandyk vel: ");
                sk.nextLine();
            }
        }

        return a;
    }

    private static void suma(Scanner sc){
        System.out.println("iveskite pirma skaiciu");
        int a = gautiGeraSkaiciu(sc);

        System.out.println("iveskite antra skaiciu");
        int b = gautiGeraSkaiciu(sc);
        System.out.println("suma yra =" + (a+b));
    }

    private static int skirtumas(Scanner sc){
        System.out.println("iveskite pirma skaiciu");
        int a = gautiGeraSkaiciu(sc);

        System.out.println("iveskite antra skaiciu");
        int b = gautiGeraSkaiciu(sc);
        return a-b;
    }

    private static int sandauga(Scanner sc){
        System.out.println("iveskite pirma skaiciu");
        int a = gautiGeraSkaiciu(sc);

        System.out.println("iveskite antra skaiciu");
        int b = gautiGeraSkaiciu(sc);
        return  a*b;
    }
}