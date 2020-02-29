package page18.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Logon implements Serializable {

    private Date date = new Date();

    private String username;

    private transient String password;

    public Logon(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "ogon info: \n  username: " + username + "\n date: " + date + "\n   password: " + password;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Logon logon = new Logon("hb", "123456");

        System.out.println("Logon a: " + logon);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("tmp/logon.out"));
        out.writeObject(logon);
        out.close();

        System.out.println("----------");
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("tmp/logon.out"));
        Logon logonRead = (Logon) in.readObject();
        System.out.println(logonRead);
        in.close();


    }
}
