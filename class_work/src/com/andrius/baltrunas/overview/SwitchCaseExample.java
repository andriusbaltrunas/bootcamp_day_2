package com.andrius.baltrunas.overview;

import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 3/13/2018.
 */
public class SwitchCaseExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite raide nuo a iki d");

        String letter = sc.nextLine();

        switch (letter){
            case "a":
                System.out.println("Gautas vardas bus Andrius");
                break;
            case "b":
                System.out.println("Gautas vardas bus Benas");
                break;
            case "c":
                System.out.println("Gautas vardas bus Cicinas");
                break;
            case "d":
                System.out.println("Gautas vardas bus Darius");
                break;
            default:
                System.out.println("Nepavyko varti ivestos raides");
                 break;
        }
    }
}
