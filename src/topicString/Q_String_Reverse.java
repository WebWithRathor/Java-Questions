package topicString;

import java.util.Scanner;

public class Q_String_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int i = name.length()-1;
        while (i >= 0){
            System.out.println(name.charAt(i--));
        }
    }
}
