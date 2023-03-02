public class SimpleThread3 implements Runnable{

    int time;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new SimpleThread3(1000));
        Thread thread2 = new Thread(new SimpleThread3(2000));
        thread1.start();
        thread2.start();
    }

    public SimpleThread3(int time) {
        this.time = time;
    }




    @Override
    public void run() {

        try {
            Thread.sleep(this.time);
            for (int i = 0; i < 100; i ++) {
                System.out.println(Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }

    }
}
