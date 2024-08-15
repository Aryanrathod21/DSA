public class SortedArray {
    public static boolean isArrayStrictlySorted(int idx,int arr[]){

  
        if (idx == arr.length - 1) {
            return true;
        }
       
            if (arr[idx] >= arr[idx+1]) {
                return false;
            }
            
        return isArrayStrictlySorted(idx+1,arr);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
       boolean result = isArrayStrictlySorted(0,arr);
       System.out.println(result);
    }
}
