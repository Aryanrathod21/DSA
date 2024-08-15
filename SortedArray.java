public class SortedArray {
    public static boolean isArrayStrictlySorted(int idx){

        int arr[] = {1,2,3,4,5};
        if (idx == arr.length - 1) {
            return true;
        }
       
            if (arr[idx] >= arr[idx+1]) {
                return false;
            }
            
        return isArrayStrictlySorted(idx+1);
    }
    public static void main(String[] args) {
       boolean result = isArrayStrictlySorted(0);
       System.out.println(result);
    }
}
