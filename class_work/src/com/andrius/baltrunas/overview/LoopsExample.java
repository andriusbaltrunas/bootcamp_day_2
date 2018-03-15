package com.andrius.baltrunas.overview;

/**
 * Created by andriusbaltrunas on 3/14/2018.
 */
public class LoopsExample {

    public static void main(String[] args){

        for(int i =0; i < 5; i++){
            System.out.println("Labas Andriau " + i);
        }

        int i =0;
        while (i < 5){
            System.out.println("Labas while " + i);
            i++;
        }

        int b =0;
        do{
            System.out.println("Labas do/while " +b);
            b++;
        }while (b < 5);
    }
}
