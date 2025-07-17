public class binarysearch {
    public static void main(String[] args) {
       System.out.println(binnarysearch(new int[] {1,2,2,5,5,6,7,8,9} , 5));
    }

    
    public static int binnarysearch(int[] arr , int x) {
        
        int l = 0;
        int r = arr.length - 1;


        while (l<=r) {
            int mid = (l + r)/2;
            if (arr[mid] == x)
           {
            return mid;
           }
           else if(x < arr[mid]) {
            r = mid - 1;
           }
           else{
            l = mid + 1;
           }
            
        }
        return  -1;

    
    }
}