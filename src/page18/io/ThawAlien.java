package page18.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ThawAlien {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(new File("tmp/x.file")));

        Object mystery = in.readObject();
        System.out.println(mystery.getClass());



    }
}
