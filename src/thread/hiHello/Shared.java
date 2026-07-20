/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread.hiHello;

/**
 *
 * @author prana
 */
public class Shared {

    /*
    boolean isHiPrinting = true;

    synchronized void printHi() {
        for (int i = 0; i < 10; i++) {
            while (!isHiPrinting) {
                try {
                    wait();
                } catch (Exception e) {
                    System.out.println("Ex" + e.getMessage());
                }
            }
            System.out.print("Hi-");
            isHiPrinting = false;
            notify();
        }

    }

    synchronized void printHello() {
        for (int i = 0; i < 10; i++) {
            while (isHiPrinting) {
                try {
                    wait();
                } catch (Exception e) {
                    System.out.println("Ex" + e.getMessage());
                }
            }
            System.out.println("Hello");
            isHiPrinting = true;
            notify();
        }

    }

     */
    boolean isHiTurn = true;

    synchronized void hiPrint() {
        for (int i = 0; i < 10; i++) {
            while (!isHiTurn) {
                try {
                    wait();
                } catch (Exception e) {
                    System.out.println("Exception" + e.getMessage());
                }
            }
            System.out.print("Hi-");
            isHiTurn = false;
            notify();
        }
    }

    synchronized void helloPrint() {
        for (int i = 0; i < 10; i++) {
            while (isHiTurn) {
                try {
                    wait();
                } catch (Exception e) {
                    System.out.println("Exception" + e.getMessage());
                }
            }
            System.out.println("Hello");
            isHiTurn = true;
            notify();
        }
    }
}
