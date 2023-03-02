public class SimpleThread1 extends Thread {

    public static void main(String[] args) {

        SimpleThread1 simpleThread1 = new SimpleThread1();
        simpleThread1.start();
        SimpleThread1 simpleThread2 = new SimpleThread1();
        simpleThread2.start();
    }



    @Override
    public void run() {
        // O anki threadin adını alıyoruz
        String threadName = SimpleThread1.currentThread().getName();

        System.out.println("Benim threadim " + threadName + " Baslatildi");

        int total = 0;
        for (int i = 0; i < 1000; i++) {
            total += i;
        }
        System.out.println("Toplam : " + total);
    }
}
