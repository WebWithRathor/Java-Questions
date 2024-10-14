package loops;

import java.util.Scanner;

public class Program28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        int pow = 1;
        for (int i = 1; i <=v ; i++) {
           pow = pow*n;
        }
        System.out.println(pow);
    }
}
