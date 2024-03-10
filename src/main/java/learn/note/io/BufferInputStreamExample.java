package learn.note.io;

import javax.swing.plaf.metal.MetalIconFactory;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BufferInputStreamExample {
    public void input() throws IOException {
        File file = new File("");
        InputStream inputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        byte[] allBytes = bufferedInputStream.readAllBytes();
        ArrayList<Byte> arrayList = new ArrayList<>();
        for (byte a : allBytes) {
            arrayList.add(a);
        }
        Byte aByte = arrayList.get(9);
        System.out.println(aByte);
        bufferedInputStream.close();
    }
}
