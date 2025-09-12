import java.util.*;

public class JavaBasic {
    public static void main(String[] args) {
        // star print 
        int n = 4 ;

        // for(int i =  1 ; i <=n ; i ++){
        //     // System.out.println(i);
        //     for(int j =1 ; j <=  n-i + 1; j++){
        //         // System.out.println(j);
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }
        // int n = 4 ;


        // number  half pyramid pattern 

        // for(int i =  1 ; i <=n ; i ++){
        //     // System.out.println(i);
        //     for(int j =1 ; j <=  i; j++){
        //         // System.out.println(j);
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }


        // character pattern 
        // char ch = 'A';
        // for(int i = 1 ; i <= n ; i++){
        //     // for(int j = 1 ; j <= n-i ; j++){
        //     //     System.out.print("-" );
        //     // }
        //     for(int cha = i ; cha <= n ; cha ++ ){
        //         System.out.print( "* ");
        //     }
        //     System.out.println();
            
        // }


        int row = 10, colo = 4 ;




        for(int i = 1 ;  i <= row ; i++){
            for(int j = 1 ; j <= colo ; j ++){
                if (i == 1 || i == row  || j == 1 || j == colo ) {
                    System.out.print(" * ");
                }else{

                    System.out.print("   ");
                }
            }
            System.out.println();
        }

       
    }
} 