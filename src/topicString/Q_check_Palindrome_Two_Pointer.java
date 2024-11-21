package topicString;

import java.util.Scanner;

public class Q_check_Palindrome_Two_Pointer {
    public  static  boolean isPalindrome(String name){
        int start = 0 , end = name.length()-1;
        while (start<end){
            if(name.charAt(start) == name.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(isPalindrome(name));
    }
}
