public class twosum {
   

    public static int[] Innertwosum(int[] arr ) {

        int target = 5;
        for(int i = 0; i<arr.length ; i++) {

             for(int j = i+1; j<arr.length ; j++){
                if(arr[i] + arr[j] == target){
                   return new int[] {i , j};
            }
        }
    }
    return new int[] {};
        
    }

     public static void main(String[] args) {

         int[] arr = {1,2,3,4,5};
         int[] result = Innertwosum(arr);

         for( int x : result){
            System.out.println(x);
         }
       
    }
        
    
    
    }
