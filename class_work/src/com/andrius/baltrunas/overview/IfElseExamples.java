package com.andrius.baltrunas.overview;

/**
 * Created by andriusbaltrunas on 3/13/2018.
 */
public class IfElseExamples {

    public static void main(String[] args) {
        int a = 12;
        int b = 54;

        if(a == b){
            System.out.println("sie skaiciai yra lygus");
        }else{
            System.out.println("sie skaiciai nera lygus");
        }

        if(a > 30){
            System.out.println(a);
        }else if(a < 10){
            System.out.println(a);
        }else{
            System.out.println("neradome nieko");
        }

        if(a > 20){
            System.out.println(a);
        }else if(b == 54){
            System.out.println("tenkina ir mes cia ateisime");
        }else if(a < 32){
            System.out.println("tenkina, bet sitos vietos mes nepasieksime, nes jau radome atitikmeni");
        }else{

        }


    }


    private static String getMessage(int numb){
        //vairiantas 1
       /* if(numb > 50){
            return "uzdirbai neblogai";
        }else {
            return "pasistenkt";
        }*/

        //variantas 2

       /* String a ;

        if(numb > 50){
            a = "uzdirbai";
        }else{
            a = "pasistenk";
        }
        return  a;*/

        //variantas 3

        String result = "pasistenk";
        if(numb > 50){
            result="uzdirbai";
        }
        return result;
    }
}
