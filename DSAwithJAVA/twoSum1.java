
// //to add two array in single array
 
// import java.util.Arrays;

// public class twoSum1 {
//     public int[] twoSum(int[] nums, int target) {
        
        
//     }

//     public static void main(String[] args) {
//         // int[] arr1 = {1,2,3,4,5};
//         // int[] arr2 = {1,2,3,4,5};

//          int[] nums = {1,2,3,4,5};
         
//        int[] 
      

//     }

  
    


//         //    int[] temp = new int[ arr1.length + arr2.length];
//         // //    for(int i = 0; i<arr1.length ; i++){
//         // //     temp[i] = arr1[i] ;
//         // //    }
//         // //    for(int j= 0 ; j< arr2.length ; j++){
//         // //     temp[arr1.length + j] = arr2[j];
//         // //    }
//         //  int index = 0;
//         // for(int t : arr1){
//         //     temp[index++] = t;
//         // }

//         //  for(int t : arr2){
//         //     temp[index++] = t;

            
//         // }
//         // Arrays.sort(temp);
//         //    for (int x : temp) {
//         //     System.out.print(" "+x);

            
//         //    }
//         //    System.out.println();
//         //    int n = temp.length;
//         //    if(n%2 != 0){

//         //      System.out.println (temp[n/2-1]+ temp[n/2]/2.0);
//         //    }
//         //    else{
//         //     System.out.println (temp[n/2]);
//         //    }
    
// }
// /



class twoSum1{
    static   public int[] twoSum(int[] nums, int target) {


      int[] temp = new int[ arr1.length + arr2.length];
           for(int i = 0; i<arr1.length ; i++){
            temp[i] = arr1[i] ;
           }
           for(int j= 0 ; j< arr2.length ; j++){
            temp[arr1.length + j] = arr2[j];
           }
         int index = 0;
        for(int t : arr1){
            temp[index++] = t;
        }

         for(int t : arr2){
            temp[index++] = t;

            
        }
        Arrays.sort(temp);
           for (int x : temp) {
            System.out.print(" "+x);

            
           }
           System.out.println();
           int n = temp.length;
           if(n%2 != 0){

             System.out.println (temp[n/2-1]+ temp[n/2]/2.0);
           }
           else{
            System.out.println (temp[n/2]);
           }
    
}
      return new int[]{};
        
        
    }
  public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    int target=5;
    twoSum(arr, target)


    
  }
}