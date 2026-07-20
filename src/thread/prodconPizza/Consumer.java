/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread.prodconPizza;

/**
 *
 * @author prana
 */
public class Consumer extends Thread{
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        super("Consumer-Thread");
        this.buffer = buffer;
    }

    public void run() {
        try {
            buffer.consume();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
