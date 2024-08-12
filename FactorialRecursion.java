
import java.util.Scanner;

public class FactorialRecursion {
    public static int CalcFact(int n){
       if (n == 1 || n == 0) {
        return 1;
       }
       int fact_nm1 = CalcFact(n-1);
       int fact_num = n*fact_nm1;
       return fact_num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = CalcFact(n);
        System.out.println(ans);
    }
}
