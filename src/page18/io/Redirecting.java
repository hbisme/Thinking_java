package page18.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class Redirecting {

    public static void main(String[] args) throws IOException {
        PrintStream console = System.out;

        BufferedInputStream in = new BufferedInputStream(new FileInputStream("/Volumes/myDocument/myIdeaProjects/Thinking_java/src/page18/io/Redirecting.java"));
        PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("tmp/test3.out")));

        System.setIn(in);
        System.setOut(out);
        System.setErr(out);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter stdout = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }

        in.close();
        out.close();
        br.close();


        System.setOut(console);
    }
}
