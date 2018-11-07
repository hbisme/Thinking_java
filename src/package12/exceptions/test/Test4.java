package package12.exceptions.test;

class MyException extends Exception {
    private String msg;
    public MyException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

public class Test4 {
    public static void main(String[] args) {

        try {
            throw new MyException("My Exception");
        } catch (MyException e) {
            System.out.println(e.getMsg());
            // e.printStackTrace();
        }

    }
}
