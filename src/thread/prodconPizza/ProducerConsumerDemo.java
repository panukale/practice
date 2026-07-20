/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread.prodconPizza;

/**
 *
 * @author prana
 */
public class ProducerConsumerDemo {
    public static void main(String[] args) {

        int productionLimit = 10;

        System.out.println("======================================");
        System.out.println(" PRODUCER - CONSUMER SIMULATION");
        System.out.println("======================================");
        System.out.println("Production Limit : " + productionLimit);
        System.out.println("--------------------------------------");

        SharedBuffer buffer = new SharedBuffer(productionLimit);

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
