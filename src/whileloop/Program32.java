package whileloop;

import java.util.Scanner;

public class Program32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy = n ;
        int rev =0;
        while (n > 0) {
            rev = (rev*10) + n % 10;
            n = n / 10;
        }
        if(copy == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");

    }
}
