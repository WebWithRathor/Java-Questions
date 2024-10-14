package Practice;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range from 1 to : ");
        int n = sc.nextInt();
        System.out.print("max fact numbers : ");
        int totalFact = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int fact = 1;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    fact++;
                }
            }
            if (fact == totalFact) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Total numbers are : " + count);
    }
}
