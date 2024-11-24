package topicString;

import java.util.Scanner;

public class Q_Toggle_Alphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int i = 0;
        while (i<name.length()){
            if(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z'){
                System.out.print((char) (name.charAt(i++)+32));
            }else{
                System.out.print((char) (name.charAt(i++)- 32));
            }
        }
    }
}
