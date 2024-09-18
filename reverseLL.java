
import java.util.LinkedList;

public class reverseLL {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("c");
        list.addFirst("b");
        list.addFirst("a");
        list.addLast("d");

        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i)+"-->");
        }
        System.out.println("null");
    }
}
