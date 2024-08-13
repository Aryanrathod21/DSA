//time complexity = O(2^n)
public class Toh {
    public static void towerOfHanoi(int n,String src,String helper,String des){
        if (n == 1) {
            System.out.println(n+" move disk from "+src+" to "+des); 
            return;
        }
        towerOfHanoi(n-1, src, des, helper);
        System.out.println(n+" move disl from "+src+" to "+des);
        towerOfHanoi(n-1, helper, src, des);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "Source", "Helper", "destination");
    }
}
