import java.util.*;
public class AssignmentString {


    public static int vowelsCount(String str){


        int count = 0 ;

        for(int i = 0 ; i < str.length() ; i ++){
            char ch = str.charAt(i) ;
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                count ++;
            }
        }


        return count ;

    }


    public static void anagramsCount(String str1 , String str2 ){


        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
            char [] str1CharArray = str1.toCharArray();
            char [] str2CharArray = str2.toCharArray();

            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            boolean result = Arrays.equals(str1CharArray , str2CharArray);

            if (result) {
                System.out.println("anagram");
            }else{
                System.out.println("Not ");
            }
        }else{
            System.out.println("false ");
        }
        

    }

    public static void main(String [] args){
        String str1 = "tanvir";
        String str2 = "tavir";

        anagramsCount(str1, str2);

        // System.out.println();
    }
}