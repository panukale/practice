package thread.hiHello;

/**
 *
 * @author pranay.kale
 */
public class Main {

    public static void main(String[] args) {
        Shared s = new Shared();
        Runnable p = new Pranay(s);
        Runnable k = new Kale(s);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(k);
        t1.start();
        t2.start();

    }
}
