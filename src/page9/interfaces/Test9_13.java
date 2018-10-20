package page9.interfaces;

interface f1 {
    void getF1();
}

interface f1_1 extends f1{

}

interface f1_2 extends f1{

}

interface f2 extends f1_1, f1_2{

}


public class Test9_13 {
}
