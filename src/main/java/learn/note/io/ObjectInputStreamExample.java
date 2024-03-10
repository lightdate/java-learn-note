package learn.note.io;

import java.io.*;

public class ObjectInputStreamExample {
    public void input() throws IOException {
        File file = new File("");
        InputStream inputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        objectInputStream.readDouble();
        objectInputStream.close();
    }
}
