package page17.containers;

import java.util.PriorityQueue;

public class TodoList extends PriorityQueue<TodoList.ToDoItem> {


    static class ToDoItem implements Comparable<ToDoItem> {
        private char primary;
        private int secondary;
        private String item;

        public ToDoItem(String item, char primary, int secondary) {
            this.primary = primary;
            this.secondary = secondary;
            this.item = item;
        }

        @Override
        public int compareTo(ToDoItem arg) {
            if (primary > arg.primary) {
                return 1;
            } else if (primary == arg.primary) {
                if (secondary > arg.secondary) {
                    return 1;
                } else if (secondary == arg.secondary) {
                    return 0;
                } else return -1;
            } else return -1;
        }

        @Override
        public String toString() {
            return Character.toString(primary) + secondary + ":" + item;
        }
    }


    public void add(String td, char pri, int sec) {
        super.add(new ToDoItem(td, pri, sec));
    }


    public static void main(String[] args) {

        TodoList toDoList = new TodoList();
        toDoList.add("Empty trash", 'C', 4);
        toDoList.add("Feed dog", 'A', 2);
        toDoList.add("Feed bird", 'B', 7);
        toDoList.add("Mo lawn", 'C', 3);
        toDoList.add("Water lawn", 'A', 1);
        toDoList.add("Feed cat", 'B', 1);

        // System.out.println(toDoList);

        while(!toDoList.isEmpty()) {
            System.out.println(toDoList.remove());
        }


    }

}
