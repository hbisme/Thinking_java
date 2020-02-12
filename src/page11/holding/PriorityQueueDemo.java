package page11.holding;

import java.util.*;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        Random random = new Random();

//        priorityQueue.offer(1);

        for (int i = 0; i < 100; i++) {
            priorityQueue.offer(random.nextInt(i + 10));
        }
//        System.out.println(priorityQueue);
        QueueDemo.print(priorityQueue);

        List<Integer> list = Arrays.asList(10,1,2,3,4);
        priorityQueue = new PriorityQueue<Integer>(list);
        System.out.println("-----");
        QueueDemo.print(priorityQueue);

        System.out.println("---");
        priorityQueue = new PriorityQueue<Integer>(list.size(), Collections.reverseOrder());
        priorityQueue.addAll(list);
        QueueDemo.print(priorityQueue);


        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(" "));
        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<String>(strings);
        QueueDemo.print(stringPriorityQueue);

        System.out.println("---");
        PriorityQueue<String> stringPriorityQueue1 = new PriorityQueue<String>(strings.size(), Collections.reverseOrder());
        stringPriorityQueue1.addAll(strings);
        QueueDemo.print(stringPriorityQueue1);


        Set<Character> characters =  new HashSet<Character>();
        for(Character c: fact.toCharArray()){
            characters.add(c);
        }
        PriorityQueue<Character> characters1 = new PriorityQueue<Character>(characters);
        System.out.println("----");
        QueueDemo.print(characters1);


    }
}
