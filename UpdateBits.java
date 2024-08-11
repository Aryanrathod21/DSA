import java.util.Scanner;

public class UpdateBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opr = sc.nextInt();
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        
        if (opr == 1) {
            //set
            int result = bitMask | n;
            System.out.println(result);
        }else{
            //clear
            int newBitmask = ~(bitMask);
            int result = newBitmask & n;
            System.out.println(result);
        }



    }
}
