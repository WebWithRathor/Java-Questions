package loops;

import java.util.Scanner;

public class Program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mul = 1;
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            mul*=i;
        }
        System.out.println(mul);
    }
}
