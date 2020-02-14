// package page15.generics;
//
// class TestA {}
// class TestB {}
//
// public class TwoTuple<A, B> {
//     public final A first;
//     public final B second;
//
//     public TwoTuple(A first, B second) {
//         this.first = first;
//         this.second = second;
//     }
//
//     @Override
//     public String toString() {
//         return "TwoTuple{" +
//                 "first=" + first +
//                 ", second=" + second +
//                 '}';
//     }
//
//     public static void main(String[] args) {
//         TestA a = new TestA();
//         TestB b = new TestB();
//         TwoTuple<TestA, TestB> t1 = new TwoTuple<TestA, TestB>(a, b);
//         System.out.println(t1);
//         t1 = new TwoTuple(a, a);
//         System.out.println(t1);
//
//         TwoTuple t2 = new TwoTuple(b, a);
//         System.out.println(t2);
//     }
// }
