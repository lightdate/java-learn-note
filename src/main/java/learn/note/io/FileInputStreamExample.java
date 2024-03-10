package learn.note.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 文件字符流操作
 */
public class FileInputStreamExample {
    public void input() throws IOException {
        File file = new File("");
        InputStream inputStream = new FileInputStream(file);
        inputStream.close();
    }
}

