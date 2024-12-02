package topicString;

import java.util.Arrays;

public class Q_Check_Anagram {
    public  static  int[] countWords (char [] word){
        int [] wordCount1 = new int[26];
        for (int i = 0; i < word.length; i++) {
           if(word[i]>= 'a' && word[i] <= 'z') wordCount1[word[i] -97]++;
           else wordCount1[word[i] -65]++;
        }
        return wordCount1;
    }

    public static boolean checkEquals (int [] arr , int [] brr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=brr[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "hello" , ptr = "eHllo";
        char [] a = str.toCharArray();
        char [] b = ptr.toCharArray();
        System.out.println(checkEquals(countWords(a),countWords(b)));
    }
}
