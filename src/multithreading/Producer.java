package multithreading;

import java.util.concurrent.BlockingDeque;

public class Producer implements Runnable{

    private final BlockingDeque<Integer> que;

    public Producer(BlockingDeque<Integer> que) {
        this.que = que;
    }

    @Override
    public void run() {
        try{
            process();
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    private void process() throws InterruptedException {
        for(int i=0; i<20; i++){
            que.add(i);
            Thread.sleep(100);
        }
    }
}
