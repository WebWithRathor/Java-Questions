package topicString;

import java.util.Arrays;

public class Q_Capitalize_First_Last_Char {

    public static char checkAndUpdateCase(char c){
        if(c >= 'a' && c<= 'z') {
            return (char)(c-32);
        }
        return c;
    }

    public static String[] capitalFirstLastChar(String[] sarr){
        for(int i =0 ; i<sarr.length ; i++){
            sarr[i] = checkAndUpdateCase(sarr[i].charAt(0)) + sarr[i].substring(1,sarr[i].length()-1)+ checkAndUpdateCase(sarr[i].charAt(sarr[i].length()-1));
        }
        return sarr;
    }

    public static void main(String[] args) {
        String str = "Hello bhai kaise ho";
        System.out.println(String.join(" " , capitalFirstLastChar(str.split(" "))));
    }
}
