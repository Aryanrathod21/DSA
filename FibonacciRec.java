public class FibonacciRec {
    public static void printFibonacci(int first,int second,int n){
        if (n == 0) {
            
            return; 
        }
        int next = first + second;
        System.out.print(next + " "); 
        printFibonacci(second, next, n-1);
    }
    public static void main(String[] args) {
        int n = 7;
        int first = 0;
        int second  = 1;
        System.out.print(first + " ");
        System.out.print(second + " ");
        printFibonacci(first, second, n-2);
    }
}
