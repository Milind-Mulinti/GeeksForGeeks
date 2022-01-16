package multithreading;

import java.util.concurrent.BlockingDeque;

public class Consumer implements Runnable{

    private final BlockingDeque<Integer> que;

    public Consumer(BlockingDeque<Integer> que) {
        this.que = que;
    }

    @Override
    public void run() {
        try{
            while (true){
                Integer take = que.take();
                process(take);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
    private void process(Integer take) throws InterruptedException {
        Thread.sleep(500);
    }
}
