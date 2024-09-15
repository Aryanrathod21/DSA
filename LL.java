public class LL {
    Node head;
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
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
            Node currNode = new Node(data);
            while (currNode.next != null) {
                currNode = currNode.next;
            }

            currNode.next = newNode;
            
        }

        //print
        public void printList(String data){
            if (head == null) {
                System.out.println("list is empty");
                return;
            }
            Node currNode = new Node(data);
            while (currNode != null) {
                System.out.print(currNode+" --> ");
            }

            System.out.println("null");
            
        }
        
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.printList();
    }
}
