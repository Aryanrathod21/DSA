
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add
        list.add(0);
        list.add(2);
        list.add(4);

        System.out.println(list);

        //get
        int element = list.get(1);
        System.out.println(element);

        list.add(1,1);
        System.out.println(list);

        list.set(3, 0);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        Collections.sort(list);
        System.out.println(list);
    }
}
