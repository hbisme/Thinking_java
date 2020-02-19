package page12.exceptions;

import java.io.*;

public class MainException {
    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("mainException");

        file.close();

    }
}
