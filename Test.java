import java.lang.annotation.Target;

class Test
{
    public static void main(String []args)
    {
        int a[] = {1,2,3,4,5,6,7};
        int target = 5;
        System.out.println("This is present in Array "+recBinSearch(0,target,a,target));
    }
    private static int recBinSearch(int start, int end, int[] a, int target){
        int mid = (start+end)/2;
        int val = a[mid];
        if (val == target) {
            return val;
        }
        else if (val > target) {
            return recBinSearch(start, mid, a, target);
            }
        else {
            System.out.println(start+" "+ end);
            return recBinSearch(mid, end, a, target);
        }
        // return -1;
    }
    private static int binSearch(int [] a, int target){
        int end = a.length;
        int start = 0;
        int mid = 0;
        int val = 0;
        while (start <= end ) {
            mid = (start+ end )/2;
            val = a[mid];
            if (val == target) {
                return val;
            }
            else if (val > target) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        return -1;
    }
    
};
