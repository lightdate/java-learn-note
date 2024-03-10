package learn.note.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 读取字符流
 */
public class FileReaderExample {
    public void input() throws IOException {
        File file = new File("");
        FileReader fileReader = new FileReader(file);
        String encoding = fileReader.getEncoding();
        System.out.println(encoding);
        fileReader.close();
    }
}
