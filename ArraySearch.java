import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of an array : ");
            int size = sc.nextInt();
            int numbers[] = new int[size];
            
            for(int i = 0;i<size;i++){
                System.out.println("Enter total "+ size + " array value : ");
                numbers[i] = sc.nextInt();
            }

            System.out.println("Find array value : ");
            int x = sc.nextInt();

            for(int i = 0;i<numbers.length;i++){
                if (numbers[i] == x) {
                    System.out.println("The value is at index "+i);
                }
            }
        }
    }
}
