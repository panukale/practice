package pattern;

import java.util.Scanner;

/**
 *
 * @author pranay
 */
public class Pattern {

    //pattern1
    public static void pattern1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    //pattern2
    public static void pattern2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    //pattern3
    public static void pattern3() {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pattern4() {
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

    public static void pattern5() {
        /*
*****
*   *
*   *
*   *
*****
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == 4) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }

    
    public static void main(String[] args) {
//        pattern1();
//        pattern2();
//        pattern3();
//        pattern4();
//        pattern5();
    }
}
