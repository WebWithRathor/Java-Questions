package Switch;

import java.util.Scanner;

public class Program43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int) (Math.random() * 100 + 1);
        int b = 0;
        int maxguess = 5;
        System.out.print("Guess a number between 1 - 100 : ");
        do {
            if(maxguess-- == 0){
                System.out.println("Ooohoooo har gye!!!!!");
                break;
            }
            b = sc.nextInt();
            if (a == b) {
                System.out.println("Correct");
                break;
            }
            if (a < b)
                System.out.println("too high");
            if (a > b)
                System.out.println("too small");

        } while (true);


    }
}
