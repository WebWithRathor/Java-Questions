package topicString;

import java.util.Scanner;

public class Q_check_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String rev = "";
        int  i = name.length()-1;
        while (i>=0){
            rev += name.charAt(i--);
        }
        System.out.println(rev.equals(name) ? "Palindrome" : "Not a palindrome");
    }
}
