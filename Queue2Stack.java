import java.util.*;

public class Queue2Stack {
    public class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }


        //enqueue
        public static void add(int data){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }           
        }

        //dequeue
        public static int remove(){
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        //front
        public static int peek(){
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
