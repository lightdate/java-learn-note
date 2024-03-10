package learn.note.io;

import java.io.*;

public class ObjectOutputStreamExample {
    public void output() throws IOException {
        File file = new File("");
        OutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject("");
        objectOutputStream.close();
    }
}
