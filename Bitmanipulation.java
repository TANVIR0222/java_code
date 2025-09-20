public class Bitmanipulation {


    public static void isPrime(int num){

        int bitmask = 1 ;

            if((num & bitmask) == 0){
                System.out.println("is prime ");
            }else{
                System.out.println(" juta he to juta he ");
            }
    }

    public static int getIthBit(int n , int i ){
        int bitmask = 1 << i ;

        if((n & bitmask ) == 0 ){
            return 0 ;
        }else{
            return 1 ;
        }
    }

    public static int setIthBit(int n , int i ){
        int bitmask = 1 << i ;

        return (n | bitmask) ;
    }

    public static int clearIthBit(int n , int i ){
        int lsbBit = ~(1 << i);
        return n & lsbBit ;
    }

   

    public static boolean oodOREven(int n){
        int bitmask = 1 ;

        if((n & bitmask) == 1){
            System.out.println("odd num");
            return true;
        }

        System.out.println("even  ");
        return false;
    }
    

    public static int getIthBits(int n  , int  i ){

        if((n & 1 << i) == 0){
            return 0 ;
        }else{
            return 1;
        }
    }

    public static int setIthBits(int n , int i ){
        int lsbSetBit = 1 << i ;
        // System.out.println(n | lsbSetBit);
        return n | lsbSetBit ;
    }

    public static int clearIthAllBits(int  n , int i ){
        int bitmask = (-1 << i);
        return n & bitmask ;
    }

    public static int bitmaskClearRange(int n , int i , int j ){
        int a = (~0) << (j + 1);   // 111...00000
        int b = (1 << i) - 1;      // 000...111
        int bitmask = a | b;       // 1s outside [i..j], 0s inside [i..j]
    
        return n | bitmask;        // <-- here is the problem
    }
    



    public static void main(String args[]){
        // System.out.println(6);
        // oodOREven(8);
        System.out.println(bitmaskClearRange(10, 2, 4));
    }
}