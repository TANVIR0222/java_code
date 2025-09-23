public class Bitmanipulation {

    public static void isPrime(int n ) {

        int bitMask = 1 ;


        if((n & bitMask ) == 1){
            System.out.println("odd ");
        }else{
            System.out.println("even");
        }
        
    }

    public static int getIthBits(int n , int i ){
        int bitBask = 1 << i ;

        if((n & bitBask) == 0){
            return 0 ;
        }else {
            return 1;
        }

        // return n & bitBask ;
    }
    public static int setIthBits(int n , int i ){
        int bitBask = 1 << i ;

        // if((n | bitBask) == 0){
        //     return 0 ;
        // }else {
        //     return 1;
        // }

        return n | bitBask ;
    }
    public static int clearIthBits(int n , int i ){
        int bitBask = ~(1 << i );

        return n & bitBask ;
    }

    public static int clearIthAllBits(int n , int i ){
        int bitBask = ((~0) << i);

        return n & bitBask;
    }

    public static int clearIthToJthAllBits(int n , int i , int j ){
        int a = (~0) << j + 1 ;
        int b = (1 << i )- 1 ;


        int bitMask = a | b ;

        return n & bitMask ;
    }

    public static boolean powOfTwo(int n){
        return (n & (n-1)) == 0 ;
    }

    public static int countOne(int n){
        
        // int bitMask = 1 >
        int count = 0 ;

        while( n > 0){
            // System.out.println(n);
            if((n & 1) != 0){
                count ++;
            }
            n = n >> 1;
        }

        return count ;


    }

    public static void main(String [] args ){
        // isPrime(6);
        System.out.println(countOne(15 ));
    }
}