package pl.sda.filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterSingleton {
    private static FileWriterSingleton instance;

    private FileWriterSingleton() {

    }

    public static FileWriterSingleton getInstance() {
        if (instance == null) {
            System.out.println("JESTEM W IF");
            instance = new FileWriterSingleton();

        }
        return instance;
    }

    public void write(String text, String file) throws IOException {
        FileWriter writer = new FileWriter(new File(file), true);
        //true dokleja a false nadpisuje tekst w stworzonym pliku txt
        writer.write(text);
        writer.close();

    }
}
