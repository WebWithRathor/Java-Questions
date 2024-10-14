package whileloop;

import java.util.Scanner;

public class Program30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem;
        int sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        System.out.println("sum is : " + sum);

    }
}
