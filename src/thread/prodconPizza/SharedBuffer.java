package thread.prodconPizza;

/**
 *
 * @author prana
 */
public class SharedBuffer {

    private int item;
    private boolean available = false;
    private final int productionLimit;
    private int producedCount = 0;
    private int consumedCount = 0;

    public SharedBuffer(int productionLimit) {
        this.productionLimit = productionLimit;
    }

    public synchronized void produce() throws InterruptedException {

        while (producedCount < productionLimit) {

            while (available) {
                wait();
            }

            item = producedCount + 1;
            producedCount++;

            System.out.println("Produced  ➜ "+Thread.currentThread().getName()+ " "+item);

            available = true;
            notifyAll();

            Thread.sleep(300); // just for cool visualization
        }

        System.out.println("Producer finished production.");
    }

    public synchronized void consume() throws InterruptedException {

        while (consumedCount < productionLimit) {

            while (!available) {
                wait();
            }

            System.out.println("Consumer  ➜ "+Thread.currentThread().getName()+" "+ item);

            consumedCount++;
            available = false;

            notifyAll();

            Thread.sleep(500); // slower consumer effect
        }

        System.out.println(" Consumer finished consumption.");
    }

}
