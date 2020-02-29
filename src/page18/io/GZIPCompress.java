package page18.io;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

// 参数:  /Volumes/myDocument/myIdeaProjects/Thinking_java/src/page18/io/GZIPcompress.java

public class GZIPCompress {

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Usage: \n Gzip compress file\n" +
                    "\t Uses GZIP compression to compress " +
                    "the file to test.gz");
            System.exit(1);
        }

        BufferedReader in = new BufferedReader(
                new FileReader(args[0])
        );

        BufferedOutputStream out = new BufferedOutputStream(
                new GZIPOutputStream(
                        new FileOutputStream("tmp/test.gz")
                )
        );

        System.out.println("Writing file");

        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }
        in.close();
        out.close();
        System.out.println("Reading file");

        BufferedReader in2 = new BufferedReader(
                new InputStreamReader(new GZIPInputStream(
                        new FileInputStream("tmp/test.gz")
                ))
        );
        String s;
        while ((s = in2.readLine()) != null) {
            System.out.println(s);
        }
    }
}
