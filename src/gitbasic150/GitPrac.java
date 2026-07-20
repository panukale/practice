/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gitbasic150;

/**
 *
 * @author prana
 */
public class GitPrac {
    
    public static void evenAndOdd(int val) {
        if (val % 2 == 0 || val == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    
    public static void isPrime(int val) {
        if (val == 0 || val == 1 || val < 0) {
            System.out.println("Not Prime.");
        }
        if (val == 2 || val == 3) {
            System.out.println("Prime.");
        }
        if (val % 2 == 0 || val % 3 == 0) {
            System.out.println("Prime.");
        }
        for (int i = 5; i * i <= val; i += 6) {
            if (val % i == 0 || val % (i + 2) == 0) {
                System.out.println("Not Prime.");
            }
        }
//        System.out.println("Prime.");
    }
    
    public static void main(String[] args) throws InterruptedException {
//        evenAndOdd(0);
        isPrime(33);
        
    }
}
