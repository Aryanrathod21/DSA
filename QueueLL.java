public class QueueLL {
    static  class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
        
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }


        //enqueue
        public static void add(int data){
            Node newNode = new Node(data);
            if (tail == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;             
        }

        //dequeue
        public static int remove(){
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int result = arr[front];
            if (front == rear) {
                front = rear = -1;
            }
            else{
                front = (front+1) % size;
            }
            return result;
        }

        //front
        public static int peek(){
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
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
