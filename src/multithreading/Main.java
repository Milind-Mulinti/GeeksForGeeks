package multithreading;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) {
        BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<Integer>(10);

        new Thread(new Producer(blockingDeque)).start();
        new Thread(new Consumer(blockingDeque)).start();
    }
}
