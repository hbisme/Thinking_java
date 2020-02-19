package page15.generics;


import java.util.Date;

class Basic2 {
    private String value;

    public String get() {
        return value;
    }

    public void set(String value) {
        this.value = value;
    }
}

class Decorator extends Basic2 {
    protected Basic2 basic;

    public Decorator(Basic2 basic) {
        this.basic = basic;
    }

    public String get() {
        return basic.get();
    }

    public void set(Basic2 basic) {
        this.basic.set(basic.get());
    }
}


class TimeStamped2 extends Decorator {
    private final long timeStamp;

    public TimeStamped2(Basic2 basic) {
        super(basic);
        timeStamp = new Date().getTime();
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}

class SerialNumbered2 extends Decorator {
    private static long counter = 1;
    private final long serialNumber = counter++;

    public SerialNumbered2(Basic2 basic) {
        super(basic);
    }

    public long getSerialNumber() {
        return serialNumber;
    }
}


public class Decoration {
    public static void main(String[] args) {
        TimeStamped2 t = new TimeStamped2(new Basic2());
        TimeStamped2 t2 = new TimeStamped2(new SerialNumbered2(new Basic2()));

        SerialNumbered2 s = new SerialNumbered2(new Basic2());
        SerialNumbered2 s2 = new SerialNumbered2(new TimeStamped2(new Basic2()));


    }
}
