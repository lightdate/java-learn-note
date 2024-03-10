package learn.note.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public void output() throws IOException {
        File file = new File("");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.close();
    }
}
