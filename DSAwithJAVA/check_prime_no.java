
public class check_prime_no {
    public static void main(String[] args) {
       for(int j = 1; j<= 100; j++){

               System.out.print(j+ " ");
               System.out.println(isprime(j));
       }

    }

    public static boolean isprime(int a){
       int res = 0;
        for(int i = 1 ; i<= a/2 ; i++){
            if(a % i ==0){
                res++;
            }
        }
        return  res == 1;

       

    }

}

