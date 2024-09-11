public class mergeSort {

    public static void conquer(int arr[],int si ,int mid, int li){

        int merged[] = new int[li - si + 1];

        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while (idx1<=mid && idx2<=li) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++]; 
        }

        while (idx2 <= li) {
            merged[x++] = arr[idx2++]; 
        }

        for(int i = 0 , j = si ; i<merged.length ; i++,j++){
            arr[j] = merged[i]; 
        }

    }

    public static void devide(int arr[],int si , int li){
        int mid = si + (li-si)/2;

        if (si>=mid) {
            return;
        }

        devide(arr, si, mid);
        devide(arr, mid + 1, li);
        conquer(arr,si,mid,li);
    }

    public static void main(String[] args) {
        int arr[] = {3,7,4,2,9,5};
        int n = arr.length;
        devide(arr, 0, n-1);
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
