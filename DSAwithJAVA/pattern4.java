public class pattern4 {
    public static void main(String[] args) {
        printpattern(4);
    }
     public static void printpattern(int n) {
       
        for(int i=n ; i >= 1 ; i--){
        
                
            for(int j=1;j<=i;j++){
                System.out.print("*");
        }
  
      System.out.println();
        }
    }
}
