public class digit_count {

    public static void main(String[] args) {
        // to count the no. of digit


        int test_value = 596543164;
      
        int count = 0;
         for(int i = 1 ; i<=test_value ; i++ ){
            test_value = test_value / 10;
            count++;
                 }
                 System.out.println(count);

    }
}