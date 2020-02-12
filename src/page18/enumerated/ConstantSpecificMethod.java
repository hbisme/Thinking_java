package page18.enumerated;

import java.text.DateFormat;
import java.util.Date;

public enum  ConstantSpecificMethod {
    Date_Time {
        @Override
        String getInfo() {
            return DateFormat.getDateInstance().format(new Date());
        }
    },

    ClassPATH {
        @Override
        String getInfo() {
            return System.getenv("CLASSPATH");
        }
    },

    VERSION {
        @Override
        String getInfo() {
            return System.getProperty("java.version");
        }
    };

    abstract String getInfo();

    public static void main(String[] args) {
        for (ConstantSpecificMethod csm : values()) {
            System.out.println(csm.getInfo());
        }
    }
}
