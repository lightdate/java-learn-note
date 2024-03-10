package learn.note.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamExample {
    public void print() throws IOException {
        File file = new File("");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        PrintStream stream = new PrintStream(fileOutputStream);
        stream.println();
        stream.close();
    }
}
