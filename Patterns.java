
public class Patterns {


    public static void NumHafPyramid(int n ){

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n - i + 1 ; j++ ){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    public static void FloydTrianglePattern(int n ){
        
        int counter = 1 ;

        for(int i = 1 ; i <= n ; i ++ ){
            for(int  j = 1 ; j <= i ; j ++){
                System.out.print(counter + " ");
                counter ++;
            }

            System.out.println();
        }

    }

    // public static void TrianglePattern( int n ){

    // }


    // public static void NumberPyramidPattern( int n ){

    //     for(int i = 0 ; i <= n ; i ++ ){
    //         for(int j = 1 ; j <= n - i  ; j++){
    //             System.out.print(" ");
    //         }

    //         for(int k = 1 ; k <= i ; k ++){
    //             System.out.print(k +  " ");
    //         }

    //         System.out.println();
    //     }
    // }
    public static void FullPyramidPattern( int n ){

        for(int i = 1 ; i <= n ; i ++ ){
            for(int j = 1 ; j <= n - i ; j ++){
                System.out.print(" ");
            }

            for(int k = 1 ; k <= i ; k++){
                System.out.print( " * ");
            }

            System.out.println();
        }

        for(int i = 1 ; i <= n ; i ++ ){
            for(int j = 1 ; j <=i - 1; j ++){
                System.out.print("  ");
            }

            for(int k = 1 ; k <= n - i + 1 ; k++){
                System.out.print( " * ");
            }

            System.out.println();
        }
    }

    public static void main(String  args[]){

        // NumHafPyramid(5);

        FullPyramidPattern(5);
    }
    
}