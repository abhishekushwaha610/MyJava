public class QuickSort {

    private static void quicksort(int [] a, int low, int high){
        // System.out.println(high);
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
        if (low<high) {
            int pivot = partition(a, low, high);
            quicksort(a, low, pivot-1);
            quicksort(a, pivot+1, high);
            
            // return;
        }
    }

    public static int partition(int[] a, int low, int high) {
        
        int i = low;
        int pivot = a[high];
        int temp;
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
        }
        temp = a[i];
        a[i] = a[high];
        a[high] = temp;
        return i;
    }
    public static void main(String[] args) {
        System.out.println("Quick Sort");
        int[] a = {5,3,6,1,4,2};
        
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();

        quicksort(a,0,a.length-1);

      
    }
}

