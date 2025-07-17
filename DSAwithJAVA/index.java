
//collection framework
//for making dynamic array (not fixed size)
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class index {
    public static void main(String[] args) {
    
         

        ArrayList<Integer> arr = new ArrayList<>();
        
        System.out.println();
        //to add new data
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(8);
      //to removeany index of data
        arr.remove(2);

        arr.add(3,55);
        //to change any data in specific index
        arr.set(0, 10);

        int odd = 0;
        int even = 0;
        //inbuild function
        // Collections.sort(arr);
        //to check value is present or not
        System.out.println(arr.contains(3));

        // for(int i = 0; i<arr.size();i++){
        //     System.out.println(arr.get(i));

            
        // }
        for( int var : arr){
            System.out.print(var + " ");
            if(var%2 == 0){
                even++;
                
            }
            else{
                odd++;
            }
           
        
    }
    System.out.println();
     System.out.println("no of odd"+odd);
            System.out.println("no of even"+even);

    


    //for no dublicate data we use Hashset

    HashSet<String> set = new HashSet<>();
    set.add("hh");
     set.add("hh");
     set.add("hhfgh");
      set.add("hvfh");
       set.remove("hh");
  
    System.out.println(set);


    //for no dubilcate data and sorted order list

    TreeSet<Integer> data = new TreeSet<>();
         data.add(552);
        data.add(385);
         data.add(55);
          data.add(555);
        data.add(55);
        data.add(85);
        System.out.print(data);

}
}
