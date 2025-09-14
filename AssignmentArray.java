public class AssignmentArray {

    public static boolean twice(int num[]){

        boolean isTwice = false ;

        for(int i = 0 ; i < num.length ; i ++){
            for(int j = i + 1 ; j < num.length ; j ++ ){
                if (num[i] == num[j]) {
                    return  isTwice = true;
                }
            }
        }


        return isTwice ;
    }

    public static int sortedAscending(int num[] , int key ) {

        int start = 0 ; int end = num.length -1 ;



        while (start <= end) {
            int  mid = (start + end) / 2 ;

            if(num[mid] == key){
                return mid;
            }

            if(num[mid] < key){
                start = mid - 1 ;

            }else {
                end = mid + 1;
            }


            

            
        }

        // for(int i = 0 ; i < num.length -1 ; i ++){
        //     System.out.print(num[i] );
        //     System.out.println(num[i + 1]);

        //     // if (num[i] > num[i + 1] ) {
        //     //     // ass_array[i] = num[i];
        //     //     System.out.println(num[i]);
        //     //     i ++ ;
        //     // }
        // }

        // System.out.println(ass_array);

        return -1 ;


    }


    // You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0

    public static int MaxShareProfit(int price[]){
        int buyPrice = Integer.MAX_VALUE ;
        int maxProfit = 0 ;

        for(int i = 0 ; i < price.length ; i++){
            if (buyPrice < price[i]) {

                int profit = price[i] - buyPrice ;

                maxProfit += Math.max(profit, maxProfit);
                
            }else{
                buyPrice = price[i];
            }
        }
         

        return maxProfit ;
    }


    // Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
    
    public static int trappingWater (int height[]) {

        int n = height.length ;


        int left_array[] = new int[n];
        left_array[ 0] = height[0];
        for(int i = 1 ; i < n ; i++ ){
            left_array[i] = Math.max(height[i], left_array[i -1 ]);
        }


        int right_array [] = new int[n];
        right_array[n-1] = height[n-1];

        for(int i = n - 2 ; i >= 0 ; i --){
            right_array[i] = Math.max(height[i], right_array[i + 1]);
        }

        int trapWater = 0 ;

        for(int i = 0 ; i < n ; i ++){
            int totalWater = Math.min(left_array[i], right_array[i]);

            trapWater += totalWater - height[i];
        }

        return trapWater ;


    }
    
    public static void main(String [] args ){
      int  num [] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1} ;

        //   System.out.println(twice(nums));
        System.out.println(trappingWater(num));
    }

}