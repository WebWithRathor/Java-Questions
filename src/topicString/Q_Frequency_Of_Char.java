package topicString;

import java.util.Arrays;

public class Q_Frequency_Of_Char {
    public static void main(String[] args) {
        int [] arr =new int[26];
        String str = "aAvasda";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                arr[(str.charAt(i)-97)]++;
            }else{
                arr[(str.charAt(i)-65)]++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println((char)(i+65) + " are " +arr[i]);
        }
    }
}
