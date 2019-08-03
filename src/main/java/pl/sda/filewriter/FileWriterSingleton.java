package pl.sda.filewriter;

import java.io.File;

public class FileWriterSingleton {
    //zabezpieczenie klasy przed stworzeniem obiektu tej klasy
    //a wiec prywatny konstruktor
    private static FileWriterSingleton instance;
     //pole instance jest w tym momencie nullem
    private FileWriterSingleton() {

    }
    public static FileWriterSingleton getInstance(){
        if (instance == null){
            instance = new FileWriterSingleton();
        }

    }
}
