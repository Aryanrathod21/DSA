public class countPaths {

    public static int pathCounts(int i,int j,int n,int m){

        if (i == n || j == m) {
            return 0;
        }

        if (i == n-1 && j == m-1) {
            return 1;
        }

        int downPaths = pathCounts(i+1, j, n, m);
        int rightPaths = pathCounts(i, j+1, n, m);

        return downPaths + rightPaths;

    }
    public static void main(String[] args) {
        int n = 3;
        int m = 3;

        int total = pathCounts(0, 0, n, m);
        System.out.println(total);
    }
}
