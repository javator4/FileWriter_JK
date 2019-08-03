package pl.sda.filewriter;

/**
 * Hello world!
 */
public class App {
    static class Task1 implements Runnable {

        @Override
        public void run() {

            for (int i = 0; i < 1000; i++) {
                System.out.println("WATEK 1: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Task2 implements Runnable {

        @Override
        public void run() {
            for (int j = 0; j < 1000; j++) {
                System.out.println("WATEK 2: " + j);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        }

        public static void main(String[] args) {
            Task1 task1 = new Task1();
            Task2 task2 = new Task2();
            //uruchomienie watkow:
            Thread thread1 = new Thread(task1);
            Thread thread2 = new Thread(task2);

            thread1.start();
            thread2.start();

        }
    }
}
