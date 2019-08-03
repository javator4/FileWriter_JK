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

        static class Task3 implements Runnable {

            @Override
            public void run() {
                for (int k = 0; k < 1000; k++) {
                    System.out.println("WATEK 3: " + k);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            static class Task4 implements Runnable {

                @Override
                public void run() {
                    for (int l = 0; l < 1000; l++) {
                        System.out.println("WATEK 3: " + l);
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
                    Task3 task3 = new Task3();
                    Task4 task4 = new Task4();
                    //uruchomienie watkow:
                    Thread thread1 = new Thread(task1);
                    Thread thread2 = new Thread(task2);
                    Thread thread3 = new Thread(task3);
                    Thread thread4 = new Thread(task4);

                    thread1.start();
                    thread2.start();
                    thread3.start();
                    thread4.start();

                }
            }
        }
    }
}
