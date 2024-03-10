package learn.note.io;

import java.io.*;

public class BufferOutputStreamExample {
    public void output() throws IOException {
        File file = new File("");
        OutputStream outputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        bufferedOutputStream.close();
    }
}
