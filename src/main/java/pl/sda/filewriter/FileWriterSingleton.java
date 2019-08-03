package pl.sda.filewriter;

import java.io.File;

public class FileWriterSingleton {
    private static FileWriterSingleton instance;
    private FileWriterSingleton() {

    }
    public static FileWriterSingleton getInstance(){
        if (instance == null){
            instance = new FileWriterSingleton();
            return instance;
        }

    }
}
