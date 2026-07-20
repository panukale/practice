/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geeksforgeeks.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author prana
 */
public class GeekForGeekBasic {
    //read number input and print

    public static int getInput() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter int value :");
            int val = sc.nextInt();
            System.out.println("val is :" + val);
            return val;
        }
    }

    public static void getInputUsingBufferReader() {
        try {
            System.out.println("Enter a value:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String valueString = br.readLine();
            System.out.println("Value is " + valueString);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        } finally {
        }
    }

    public static void swapNumber(int val1, int val2) {
        System.out.println("Number before :" + val1 + " and " + val2);
//Using thrid variable
//        int temp = val1;
//        val1 = val2;
//        val2 = temp;
        val1 = val1 + val2;
        val2 = val1 - val2;
        val1 = val1 - val2;

        System.out.println("Number before :" + val1 + " and " + val2);
    }

    public static void main(String[] args) {
//        getInput();
//        getInputUsingBufferReader();
        swapNumber(10, 20);
    }
}
