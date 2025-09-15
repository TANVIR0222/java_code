import java.util.*;;

public class Matrices {

    // matrices search
    public static void searchMatrices(int matrices[][]  ){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE ;

        for(int i = 0 ; i < matrices.length ; i++){
            for(int j = 0 ; j < matrices.length ; j ++){


                min = Math.min(matrices[i][j], min);
                max = Math.max(matrices[i][j], max);

            }
        }

        System.out.println( "min value " + min );
        System.out.println( "max value " + max );


    }


    // spiral matrices 
    // public static void printSpiral(int matrices[][]){

    //     int startRow = 0 ;
    //     int startCol = 0 ;
    //     int endRow = matrices.length - 1 ;
    //     int endCol = matrices[0].length - 1;


    //     while(startRow <= endRow && startCol <= endCol ){

    //         // top n = row ->  i  , m -> j = col 
    //         for(int j = startCol ; j <= endCol ; j ++ ){
    //             System.out.print(matrices[startRow][j] + " ");
    //         };
    //         // right 
    //         for(int i = startRow + 1 ; i <= endRow ; i ++ ){
    //             System.out.print(matrices[i][endCol] + " ");
    //         }

    //         // button 
    //         for(int j = endCol -1 ; j >= startCol ; j --){
    //             System.out.print(matrices[endRow][j] + " ");
    //         }

    //         // left 
    //         for(int i = endRow - 1 ; i >= startRow + 1 ; i --){
    //             System.out.print(matrices[i][startCol] + " ");
    //         }

    //         startRow ++ ;
    //         startCol ++ ;
    //         endCol -- ;
    //         endRow -- ;
    //     }
    //     System.out.println();


    // }



    public static void matricesSpiralPrint(int matrices[][]){
        int startRow = 0;
        int startCol = 0 ;
        int endRow = matrices.length -1 ;
        int endCol = matrices[0].length - 1 ;



       while(startRow <= endRow && startCol <= endCol){

        // top 
        for(int c = startCol ; c <= endCol ; c++){
            System.out.print(matrices[startRow][c] + " ");
        }
        //  right 
        for(int r = startRow + 1 ; r <= endCol ; r++ ){
            System.out.print(matrices[r][endCol] + " ");
        }

        // bottom 
        for(int c = endCol - 1 ; c >= startCol ; c --  ){
            if (startRow == endRow) {
                break ;
            }
            System.out.print(matrices[endRow][c] + " ");
        }

        // left
        for(int r = endCol - 1 ; r >= startRow + 1; r -- ){
            if(startCol == endCol ){
                break ;
            }
            System.out.print(matrices[r][startCol] + " ");

        }

        startCol ++ ;
        startRow ++ ;
        endCol --;
        endRow -- ;

       }

       System.out.println();

    }



    // spiral matrices sum 

    public static void printSpiralSum(int matrices[][]){
        int primarySum = 0;

        // for(int i = 0 ; i < matrices.length ; i ++){
        //     for(int j = 0 ; j < matrices[0].length ; j ++){
        //         if (i == j) {
        //             primarySum += matrices[i][j];
        //         }else if(i + j == matrices.length - 1){
        //             primarySum += matrices[i][j];
        //         }
        //     }
        // }

        for(int i = 0 ; i < matrices.length ; i ++){

            primarySum += matrices[i][i];

            // n * n 
            if(i != matrices.length - i - 1)
                primarySum += matrices[i][matrices.length - i - 1];



        }
        
        
        System.out.println(primarySum);
    }

    public static boolean matricesSear(int matrices [][] , int  target ){
        int r = 0 , c = matrices[0].length - 1;

        while (r < matrices.length && c >= 0) {

            if(matrices[r][c] == target ) {
                return true ;
            } else if(matrices[r][c] < target){
                r++ ;
            }else{
                c -- ;
            }
            

        }

        return false ;
    }


    public static void search(int matrices [][] , int  target ){

        for(int i = 0 ; i < matrices.length ; i++){
            for(int j = 0 ; j < matrices[0].length ; j ++){
                if (matrices[i][j] == target) {
                    System.out.println("sou ");
                }
            }
        }

    }   


    public static void main(String []args ){


        int matrices [][] = {{-1, 3 }};
        int target = 3 ;

        // System.out.println(printSpiralSum(matrices));
        // System.out.println(matricesSear(matrices , target));

        search(matrices, target);


        // int matrices [][] = new int[3][3];

        // Scanner sc = new Scanner(System.in);

        // // n == row , m == column
        // int n = matrices.length  , m = matrices[0].length ;

        // // row
        // for(int i = 0 ; i < n ; i ++){
        //     // column 
        //     for(int j = 0 ; j < m ; j++){
        //         matrices[i][j] = sc.nextInt();
        //     }
        // }


        // // output 
        // for(int i = 0 ; i < n ; i ++){
        //     // column 
        //     for(int j = 0 ; j < m ; j++){

        //         System.out.print(matrices[i][j] + " ");
                
        //         // matrices[i][j] = sc.nextInt();
        //     }
        //     System.out.println();
        // }


        // searchMatrices(matrices);


    }
}
