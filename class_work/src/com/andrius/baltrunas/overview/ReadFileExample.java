package com.andrius.baltrunas.overview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by andriusbaltrunas on 3/13/2018.
 */
public class ReadFileExample {

    public static void main(String[] args) {

        try(BufferedReader bf = new BufferedReader(new FileReader("names.txt"))){
            String line;
            while ((line = bf.readLine()) != null){
                System.out.println(line);
            }

        }catch (IOException e){

        }
    }
}
