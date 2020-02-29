package page18.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FreezeAlien {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("tmp/x.file")
        );

        Object quellek = new Alien();
        out.writeObject(quellek);

    }
}
