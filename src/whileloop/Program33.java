package whileloop;

import java.util.Scanner;

public class Program33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem;
        int copy = n;
        int Compsum = 0;
        while (n > 0) {
            rem = n%10;
            int fac = 1;
            for (int i = rem; i > 0; i--) {
                fac *= i;
            }
            Compsum += fac;
            n=n/10;
        }

        System.out.println(   Compsum == copy ? "Strong" : "Not Strong" );


    }
}
