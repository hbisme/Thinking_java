package package17.containers;

import net.mindview.util.Generator;

import java.util.*;
import java.util.concurrent.*;

public class QueueBehavior {
    private static int count = 10;

    static <T> void test(Queue<T> queue, Generator<T> gen) {
        for (int i = 0; i < count; i++) {
            queue.offer(gen.next());

            while (queue.peek() != null) {
                System.out.print(queue.remove() + " ");
            }
        }
        System.out.println();

    }

    static class Gen implements Generator<String> {
        int i;

        String[] s = ("one two three four five six seven eight nine ten").split(" ");

        @Override
        public String next() {
            return s[i++];
        }
    }

    public static void main(String[] args) {
        test(new LinkedList<String>(), new Gen());
        test(new PriorityQueue<String>(), new Gen());
        test(new ArrayBlockingQueue<String>(count), new Gen());
        test(new ConcurrentLinkedDeque<String>(), new Gen());
        test(new LinkedBlockingDeque<String>(), new Gen());
        test(new PriorityBlockingQueue<String>(),new Gen());

    }

}
