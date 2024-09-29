package loops;

import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n*i));
        }
    }
}
