/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread.hiHello;

/**
 *
 * @author prana
 */
public class Pranay implements Runnable {

    Shared s;

    public Pranay(Shared s) {
        this.s = s;
    }

    @Override
    public void run() {
        s.hiPrint();
    }

}
