public class SimpleThread2 implements Runnable{

    public static void main(String[] args) {
        Thread thread1 = new Thread(new SimpleThread2());
        Thread thread2 = new Thread(new SimpleThread2());

        thread1.start();
        thread2.start();
    }
    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
