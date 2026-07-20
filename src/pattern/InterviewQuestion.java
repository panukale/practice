/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;

import java.util.Scanner;

/**
 *
 * @author prana
 */
public class InterviewQuestion {

    public static void pattern() {
        /*
        A
        AB
        ABC
        AB
        A

if i have 5 rows means ABC*2-1
         */
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Enter a number less than 26.");
            int number = scanner.nextInt();
            String pyrimid = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            int rows = number * 2 - 1;
            for (int i = 0; i < rows; i++) {
                int charToPrint = i < number ? i + 1 : rows - i;
                String val = pyrimid.substring(0, charToPrint);
                System.out.println(val);
            }
        } catch (Exception e) {
            System.out.println("Exception while printing pyrimid." + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void pattern1() {
        System.out.println("Enter a number below 1 to 26");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int row = number * 2 - 1;
        String pyrimid = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < row; i++) {
            int charToPrint = i < number ? i + 1 : row - i;
            System.out.println(pyrimid.substring(0, charToPrint));
        }
    }

    public static void main(String[] args) {
//        pattern();
        pattern1();
    }
}
