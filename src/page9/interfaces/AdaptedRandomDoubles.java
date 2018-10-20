package page9.interfaces;

import java.io.IOException;
import java.nio.*;
import java.util.*;
public class AdaptedRandomDoubles extends RandomDoubles implements Readable{

    private int count;
    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) {
        if(count-- == 0)
            return  -1;

        String result = Double.toString(next()) + " ";
        cb.append(result);
        System.out.println("cb: " + cb.length());
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomDoubles(7));
        while(s.hasNextDouble()){
            System.out.println(s.nextDouble() + " ");
        }
    }


}
