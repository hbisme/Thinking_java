package page18.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class BufferToText {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws IOException {
        FileChannel fc = new FileOutputStream("tmp/data2.txt").getChannel();

        fc.write(ByteBuffer.wrap("Some text2".getBytes()));
        fc.close();

        fc = new FileInputStream("tmp/data2.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();

        System.out.println(buff.asCharBuffer());


        buff.rewind();
        String encoding = System.getProperty("file.encoding");
        System.out.println("Decode using " + encoding + ": " + Charset.forName(encoding).decode(buff));

        fc = new FileOutputStream("tmp/data2.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some text3".getBytes("UTF-16BE")));
        fc.close();

        fc = new FileInputStream("tmp/data2.txt").getChannel();
        buff.clear();
        fc.read(buff);
        buff.flip();
        System.out.println(buff.asCharBuffer());

        fc = new FileOutputStream("tmp/data2.txt").getChannel();
        buff = ByteBuffer.allocate(24);
        buff.asCharBuffer().put("Some text4");
        fc.write(buff);
        fc.close();

        fc = new FileInputStream("tmp/data2.txt").getChannel();
        buff.clear();
        fc.read(buff);
        buff.flip();
        System.out.println(buff.asCharBuffer());

    }
}