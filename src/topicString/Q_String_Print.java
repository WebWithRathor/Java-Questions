package topicString;

import java.util.Scanner;

public class Q_String_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int i =0;
        while (i < name.length()){
            System.out.println(name.charAt(i++));
        }
    }
}
