
import java.util.LinkedList;

public class LLPackage {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        System.out.println(list);

        list.addLast("list");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.size());
    }
}
