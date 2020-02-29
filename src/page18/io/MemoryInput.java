package page18.io;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFile.read("/Volumes/myDocument/myIdeaProjects/Thinking_java/src/page18/io/MemoryInput.java"));
        int c;
        while((c = in.read())!= -1) {
            System.out.print((char)c);
        }
    }
}