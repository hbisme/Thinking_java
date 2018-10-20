package package11.holding;

import java.util.*;



public class QueueDemo {
    public static void print(Queue queue){
        while(queue.peek() != null){
            System.out.println(queue.remove() + " ");
        }

    }


    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            queue.offer(random.nextInt(10+i));
        }
        System.out.println(queue);

        LinkedList<Character> qc = new LinkedList<Character>();
        for(Character c :"Brontosaurus".toCharArray()){
            qc.offer(c);
        }
        System.out.println(qc);

    }
}
