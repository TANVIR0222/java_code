import java.util.*;

public class Strings {

    public static void printString(String str){

        for(int i = 0 ; i <str.length() ; i ++ ){
            System.out.print(str.charAt(i) + ' ');
        }

    }


    public static boolean isPalindrome(String str){
        
        for (int i = 0 ; i <= str.length() / 2 ; i++){
            if(str.charAt(i) != str.charAt(str.length()-i - 1)) return false;
        }

        return true;
    }


    public static float sortPath(String path){

        int x = 0 , y = 0 ;

        for(int i = 0 ; i < path.length() ; i ++){
            char dir = path.charAt(i);

            if(dir == 'N'){
                y ++ ;
            }else if(dir == 'S'){
                y -- ;
            }else if(dir == 'E'){
                x ++ ;
            }else {
                x -- ;
            }
        }


        int X2 = x * x ;
        int Y2 = y * y ;

        return (float)Math.sqrt(X2 + Y2);

    }

    public static String subString(String str , int si , int ei ){

        String subStringCount = "";

        for(int i = si ; i < ei  ;  i++ ){
            subStringCount += str.charAt(i);
        }

        return subStringCount ;

    }


    public static void StrToUpperCase(String str){

        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && i < str.length() - 1 ){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb);

    }


    public static boolean isBo

    public static void count (String str ){
        String v = "aeiou" ;
        int count = 0 ;

        // v.sort()

        // for(int i = 0 ; i < str.length() ; i++  ){
        //     if(v == str.charAt(i)){
        //         count++ ;
        //     }

        // }
    }



    public static void main(String [] args){
       
       String str = "i am tanvir islam" ;
       StrToUpperCase(str);
        

    }
}
