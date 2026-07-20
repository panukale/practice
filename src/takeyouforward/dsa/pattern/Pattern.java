/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package takeyouforward.dsa.pattern;

/**
 *
 * @author prana
 */
public class Pattern {

    public static void rectangular() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightAngleTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightAngleTriangleNumber() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void rightAngleTriangleNumberRepeat() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }

    public static void rightAngleTriangleReverse() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightAngleTriangleReverseNumber() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void ewuolateralTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void ewuolateralTriangleReverse() {
        int n = 10;

        for (int i = 0; i < n / 2; i++) {

            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j < n - (i * 2); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void diamond() {
        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i < n; i++) {

            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j < n - (i * 2); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        rectangular();
        System.out.println("--------NEW---------");
        rightAngleTriangle();
        System.out.println("--------NEW---------");
        rightAngleTriangleNumber();
        System.out.println("--------NEW---------");
        rightAngleTriangleNumberRepeat();
        System.out.println("--------NEW---------");
        rightAngleTriangleReverse();
        System.out.println("--------NEW---------");
        rightAngleTriangleReverseNumber();
        System.out.println("--------NEW---------");
        ewuolateralTriangle();
        System.out.println("--------NEW---------");
        ewuolateralTriangleReverse();
        System.out.println("--------NEW---------");
        diamond();
    }
}
