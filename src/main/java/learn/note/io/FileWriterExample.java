package learn.note.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public void output() throws IOException {
        File file = new File("");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.close();
    }
}
