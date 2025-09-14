import java.util.*;

import org.w3c.dom.traversal.TreeWalker;

public class FirstArray {

    public static void LargestNum(int num[]){

        int largest = Integer.MIN_VALUE ;


        for(int i = 0 ; i < num.length ; i++){

            if(largest <  num[i]){
                largest = num[i];
                // num[i]++;
            }

        }
        
        System.out.println(largest);

    }

    public static String linearSearchString(String chars[] ,String key){
        for(int ch = 0 ; ch < chars.length ; ch ++  ){

            if(chars[ch].equals(key)){
                // return " ";
                System.out.println("Found " + chars[ch]);
            }

        }

        return "Not Found" ;
    }


    public static int  linearSearch(int num[] , int key ){
        for(int i = 0 ; i < num.length ; i ++ ){
           if (num[i] == key) {
            return i ;
           }
        }

        return -1 ;
    }


    public static int binarySearch( int num [] , int key){

       int start = 0 , end = num.length - 1 ;


        while (start <=  end) {
            int mid = (start + end )/ 2 ; 



            if (num[mid] == key) {
                return mid ;
            }
             if(num[mid] < key){
                start = mid + 1 ;
            }else {
                end = mid - 1 ;
            }


        }


        return - 1 ;



    


        
    }


    public static void ReverseNumber(int number []){


        int first = 0 , last = number.length -1 ;


        while(first < last){


            int temp = number[last];
            number[last] = number[first];
            number[first] = temp ;
            
            first ++ ;
            last -- ;

        }

    }


    public static void PairNumber(int [] number){

        int current_sum = 0 ;
        int max_sum  = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE ;


        for(int i = 0 ; i <= number.length ; i ++){

            for(int j = i; j < number.length ; j ++ ){
                current_sum = 0 ;
                for(int k = i ; k <= j ; k ++ ){
                    // System.out.print(number[k] + " ");
                    current_sum += number[k];

                    System.out.println(current_sum);


                    if (max_sum < current_sum) {
                        max_sum = current_sum ;
                    }

                    if (min_sum > current_sum) {
                        min_sum = current_sum ;
                    }


                    
                }

                System.out.println();
            }

            System.out.println();
        }
        System.out.println("Total sub array" + max_sum + " " + min_sum);
    }
   
   
    public static void AdPairNumber(int [] number){

        int current_sum = 0 ;
        int max_sum = Integer.MIN_VALUE;

        int prefix [] = new int[number.length];

        prefix[0] = number[0];

        for(int i = 1 ; i < prefix.length ; i ++ ){
            prefix[i] = prefix[i - i] + number[i] ;
        }
        


        for(int i = 0 ; i <= number.length ; i ++){

            for(int j = i; j < number.length ; j ++ ){
                // current_sum = 0 ;

                current_sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (max_sum < current_sum) {
                    max_sum = current_sum ;
                }

            }

        }
        System.out.println("Total sub array" + max_sum );
    }


    // kadane's algorithom
    public static void kadane(int num []){
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE ;


        for(int i = 0 ; i < num.length ; i++){
            current_sum += num[i];

            if (current_sum < 0) {
                current_sum = 0 ;
            }

            max_sum = Math.max(current_sum , max_sum);
        }

        System.out.println(max_sum);
    }

    // public static int TrappinWrater(int height[]){

    //     int n = height.length ;
    //     //  calculate left max value 
    //     int left_max[] = new int[n];
    //     left_max[0] = height[0];
    //     for(int i = 1 ; i < n ; i ++ ){
    //         left_max[i] = Math.max(height[i], left_max[i-1]);
    //     }

    //     //  calculate right max  value 
    //     int right_max[ ] = new int[n];
    //     right_max[n-1] = height[n-1];
    //     for(int i = n - 2 ;  i >= 0  ; i --){
    //         right_max[i] = Math.max(height[i], right_max[i + 1]);
    //     }

    //     // calculate all value 
    //     int trap_water = 0 ;

    //     // loop 
    //     for(int i = 0 ; i < n ; i ++){
    //         // calculate min value 
    //         int water_level = Math.min(left_max[i], right_max[i]);
    //         // 
    //         trap_water += water_level - height[i];

    //     }

    //     return trap_water;




    // }


    // 4,2,0,6,3,2,5 


    public static int trap_water(int height[]){


        int n = height.length ;


        // calculate left max value 
        int left_max[] = new int[n];
        left_max[0] = height[0];
        for(int i = 1 ; i < n ; i ++){
            left_max [i] = Math.max(height[i] , left_max[i - 1]);
        }


        // calculate right max value 
        int right_max [] = new int[n];
        right_max[n - 1] = height[n - 1];
        
        for(int i = n - 2 ; i >= 0 ; i--){
            right_max[i] = Math.max(height[i] , right_max[i + 1 ]);
        }


        // 

        int trapping_water = 0;
        for(int i = 0 ; i < n ; i ++){
            int water_level = Math.min(left_max[i] , right_max[i]);

            trapping_water += water_level - height[i];
        }


        return trapping_water ;
        


    }


    

    public static int maxProfit(int price[]){


        int buyPrice = Integer.MAX_VALUE ;
        int maxProfit = 0;
        
        
        for(int i = 0 ; i < price.length ; i++){

            if(buyPrice < price[i]){

                int profit = price[i] - buyPrice ;

                maxProfit = Math.max(profit , maxProfit);

            }else {
                buyPrice = price[i];
            }



        }

        return maxProfit ;



    }


    public static void main(String args[]){
        int height[] = {7,1,5,3,6,4};

        // LargestNum(num);
        // int key = 10;

        System.out.println(maxProfit(height));




        // int index = binarySearch(num , key);

        // System.out.println(index);

        // kadane(num);

        // for(int i = 0 ; i < num.length ; i++ ){
        //     System.out.print(num[i] + " ");
        // }
        // System.out.println();


        // if (index == -1 ) {
        //     System.out.println("Not Found ");
        // }else{
        //     System.out.println("Found of Num"  +  index);
        // }




        // String chars[] = {"q" , "a" , "b" ,"c"};
        // String key  = "q";


        // String index =  linearSearchString(chars, key);
        // linearSearchString(chars, key);

    

    }
    
}
