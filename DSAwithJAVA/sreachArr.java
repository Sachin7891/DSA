public class sreachArr {
    public static void main(String[] args) {
        //to search an element in given array
        // or linear sreach

        int[] arr = {10,11,12,13,14,15};
        int target = 12;

        for (int ar: arr) {

            // String res = (ar == target)?"Positive";
            // System.out.println(res);
           
          
           if(ar == target)
           {
            System.out.println(ar);
           }
        }


       

        
    }
}
