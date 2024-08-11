import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = sc.nextLine(); 
        StringBuilder sb = new StringBuilder(input);

        for (int i = 0;i<sb.length()/2;i++) {
            int first = i;
            int last = sb.length() - 1 - i;

            char firstChar = sb.charAt(first);
            char lastChar = sb.charAt(last);

            sb.setCharAt(first, lastChar);
            sb.setCharAt(last, firstChar);

            
        }

        System.out.println(sb);
    }
}
