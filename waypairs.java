public class waypairs {

    public static int pairWays(int n){

        if (n <= 1) {
            return 1;
        }

        int single = pairWays(n-1);

        int pairs = (n-1) * pairWays(n-2);

        return single + pairs;

    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(pairWays(n));
    }
}
