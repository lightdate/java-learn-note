package learn.note.io;

import java.io.*;

public class BufferWriterExample {
    public void output() throws IOException {
        File file = new File("");
        Writer writer = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.close();
    }
}
