public class Functions{


    public static void  factor(int a  ){
        

        // if (a > 0) {
        //     return 0;
        // }

        // for(int i =  )

        
        

      
    }

    public static int Fac(int f ){

        int total = 1;


        for(int  i = 1 ; i <= f ; i++){
            total *= i;
        }


        return total;

    }


    public static int sum(int a , int b){
        return a + b;
    }
    public static float sum( float a , float b){
        return a + b;
    }


    public static boolean isPrime(int  n){

        boolean isPrime = true;

        for(int i = 2 ; i <= Math.sqrt(n) ; i ++){
            if (n % i == 0) {
                isPrime = false;
            }   
            System.out.println(i);     
        }

        return isPrime ;

    }


    public static void binaryToDec(int binNum ){
        int pow = 0 ;
        int dce = 0 ;

        while (binNum > 0) {
            int lastDigit =  binNum % 10 ;

            dce = dce + lastDigit * (int)Math.pow(2, pow);
            pow ++ ;
            binNum /= 10;
        }

        System.out.println(dce);
    }

    public static void main(String []args){

        binaryToDec(111);
        
    }
}