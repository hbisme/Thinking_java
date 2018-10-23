package package10.innerclasses;

public class DotNew {
    public class Inner{}

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        // 外部类来创建类,要使用"外部类对象.new"
        DotNew.Inner dni  =dn.new Inner();
    }
}
