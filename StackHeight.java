public class StackHeight {
    public static int calPower(int x,int n){
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return  1;
        }
        int calPownm1 = calPower(x, n-1);
        int calPown = x * calPownm1;
        return calPown ; 
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = calPower(x, n);
        System.out.println(ans);
    }
}
