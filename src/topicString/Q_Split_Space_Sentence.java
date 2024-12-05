package topicString;

import java.util.Arrays;
import java.util.Scanner;

public class Q_Split_Space_Sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence seprated by space : ");
        String str = sc.nextLine();
        String [] words = str.split(" ");
        for(String word : words) System.out.println((word.charAt(0)>='a' && word.charAt(word.length()-1)<= 'z') ? (char)(word.charAt(0)-32) + word.substring(1) : word);
    }
}
