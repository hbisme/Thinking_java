package page15.generics;

import java.util.Date;

interface TimeStamped {
    long getStamp();
}

class TimestampledImp implements TimeStamped {
    private final long timeStamp;

    public TimestampledImp() {
        this.timeStamp = new Date().getTime();
    }

    @Override
    public long getStamp() {
        return timeStamp;
    }
}

interface SerialNumbered {
    long getSerialNumber();
}

class SerialNumberedImp implements SerialNumbered {
    private static long counter;
    private final long serialNumber = counter++;

    @Override
    public long getSerialNumber() {
        return serialNumber;
    }
}

interface Basic {
    public void set(String val);

    public String get();
}

class BasicImp implements Basic {
    private String value;

    @Override
    public String get() {
        return value;
    }

    @Override
    public void set(String value) {
        this.value = value;
    }
}

class Mixin extends BasicImp implements TimeStamped, SerialNumbered {
    private TimestampledImp timestampledImp = new TimestampledImp();
    private SerialNumberedImp serialNumberedImp = new SerialNumberedImp();

    @Override
    public long getStamp() {
        return timestampledImp.getStamp();
    }

    @Override
    public long getSerialNumber() {
        return serialNumberedImp.getSerialNumber();
    }
}

public class Mixins {
    public static void main(String[] args) {
        Mixin mixin1 = new Mixin();
        Mixin mixin2 = new Mixin();

        mixin1.set("test strring 1");
        mixin2.set("test strring 2");

        System.out.println(mixin1.get() + " " + mixin1.getStamp() + " " + mixin1.getSerialNumber());
        System.out.println(mixin2.get() + " " + mixin2.getStamp() + " " + mixin2.getSerialNumber());


    }
}
