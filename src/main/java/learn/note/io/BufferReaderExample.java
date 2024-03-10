package learn.note.io;

import java.io.*;

public class BufferReaderExample {
    public void input() throws IOException {
        File file = new File("");
        Reader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String aLine = bufferedReader.readLine();
        System.out.println(aLine);
        bufferedReader.close();
    }
}
