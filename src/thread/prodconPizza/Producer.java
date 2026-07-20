/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread.prodconPizza;

/**
 *
 * @author prana
 */
public class Producer extends Thread{
    private final SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        super("Producer-Thread");
        this.buffer = buffer;
    }

    public void run() {
        try {
            buffer.produce();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
