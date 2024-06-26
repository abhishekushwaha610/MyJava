public class MergeSort {
    public static void main(String[] arg){
        System.out.println("Before merge sort Algo.");

        int[] arr = {7,2,3,4,1};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        mergeSort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void mergeSort(int []arr,int l,int r){
        if (l<r){
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);

            merge(arr,l,mid,r);
            for (int i : arr) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void merge(int arr[],int l,int mid, int r) {
        int[] n1 = new int[mid-l+1]; 
        int[] n2 = new int[r-mid]; 
        int count = 0;
        
        for (int i = 0; i < mid-l+1; i++) {
            n1[i] = arr[i+l];
            count++;
        }
        for (int i = 0; i < r-mid; i++) {
            n2[i] = arr[mid+1+i];
            count++;
        }
        
        int i=0; int j =0; int k=l;

        while ((mid-l+1)>i && (r-mid)>j){
            if (n1[i] > n2[j]) {
                arr[k]= n2[j];
                j++;
            }
            else{
                arr[k]=n1[i];
                i++;
            }
            k++;
        }
        while ((mid-l+1)>i){
            arr[k]=n1[i];
            i++;
            k++;
        }
        while ((r-mid)>j){
            arr[k]= n2[j];
            k++;
            j++;
        }
    }
}
