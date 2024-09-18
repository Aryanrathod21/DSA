public class LL {
    Node head;
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

        //add first

        public void addFirst(String data){
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
            
        }

        //add last
        public void addLast(String data){
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }

            currNode.next = newNode;
            
        }

        //print
        public void printList(){
            if (head == null) {
                System.out.println("list is empty");
                return;
            }
            Node currNode = head;
            while (currNode != null) {
                System.out.print(currNode.data+" --> ");
                currNode = currNode.next;
            }

            System.out.println("null");
            
        }
        
        public void reverseItrate(){

            if (head == null || head.next == null) {
                return;
            }
            Node prevNode = head;
            Node currNode = head.next;

            while (currNode != null) {
                Node nextNode = currNode.next;
                currNode.next = prevNode;

                //update

                prevNode = currNode;
                currNode = nextNode;
            }

            head.next = null;
            head = prevNode;


        }

        public Node recursiveReverseLL(Node head){
            if (head == null || head.next == null) {
                return head;
            }

            Node newHead = recursiveReverseLL(head.next);
            head.next.next = head;
            head.next = null;

            return newHead;
        }
    
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("c");
        list.addFirst("b");
        list.addFirst("a");
        list.printList();
        list.reverseItrate();
        list.printList(); 

        list.head = list.recursiveReverseLL(list.head);
        list.printList();
    }
}
