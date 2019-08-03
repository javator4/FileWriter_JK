package pl.sda.filewriter;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    static class Task1 implements Runnable {

        @Override
        public void run() {
            FileWriterSingleton fileWriterSingleton = FileWriterSingleton.getInstance();
            System.out.println(fileWriterSingleton);
            try {
                fileWriterSingleton.write("To jest drugi watek \n", "data.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static class Task2 implements Runnable {

        @Override
        public void run() {
            FileWriterSingleton fileWriterSingleton = FileWriterSingleton.getInstance();
            System.out.println(fileWriterSingleton);
            try {
                fileWriterSingleton.write("To jest drugi watek \n", "data.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static class Task3 implements Runnable {

        @Override
        public void run() {
            FileWriterSingleton fileWriterSingleton = FileWriterSingleton.getInstance();
            System.out.println(fileWriterSingleton);
            try {
                fileWriterSingleton.write("To jest drugi watek \n", "data.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    static class Task4 implements Runnable {

        @Override
        public void run() {
            FileWriterSingleton fileWriterSingleton = FileWriterSingleton.getInstance();
            System.out.println(fileWriterSingleton);
            try {
                fileWriterSingleton.write("To jest drugi watek \n", "data.txt");
            } catch (IOException e) {
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

        //              FileWriterSingleton fileWriterSingleton = FileWriterSingleton.getInstance();
        //            FileWriterSingleton fileWriterSingleton2 = FileWriterSingleton.getInstance();
        //          FileWriterSingleton fileWriterSingleton3 = FileWriterSingleton.getInstance();
    }
}

