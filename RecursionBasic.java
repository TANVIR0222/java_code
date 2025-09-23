public class RecursionBasic {

    public static void printNumber(int n){
        if(n == 10){
            System.out.println(10);
            return ;
        }

       if ((n & 1) == 1) {
        System.out.print( n + " ");
       }
        printNumber(n + 1);
    }
    public static int printFactorial(int n){

        if(n == 0){
            return 0 ;
        }
       
        return n + printFactorial(n - 1) ;

    }

    public static int fib(int n ){

        if(n== 0 || n == 1){
            return n ;
        }

        int nm1 = fib(n - 1);
        int nm2 = fib(n - 2);

        int totalFib = nm1 + nm2;

        return totalFib ;


    }


    public static boolean isSorted(int arr[], int i){

        if(i == arr.length - 1){
            return true ;
        }

        if(arr[i] > arr[i + 1]){
            return false ;
        }

        return isSorted(arr, i + 1) ;

    }


    public static int firstOccurence(int arr [] , int key , int i){

        // int index = 3;
    
        if(i == arr.length ){
            return - 1 ;
        }

        if(arr[i] == key){
            int  index = 0 ;
            index =  i ;
           if (index > 0) {
            index = 0 ;
            return index  = i ;
           }
        }

        
        return firstOccurence(arr, key ,i + 1);
    

    }

    
      


    

    
    public static void main(String[] args) {
        // int n = 25;
    //    System.out.println( fib(n));

        int arr [] = {8,3,6,5,10,12,5};

        System.out.println(firstOccurence(arr, 5, 0));


    }

}
