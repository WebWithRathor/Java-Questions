package loops;

import java.util.Scanner;

public class Program26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i <= n/2 ; i++) {
            if(n%i == 0){
                flag = false;
                break;
            }
        }
        if(flag && n!=1)
            System.out.println("Prime");
        else
            System.out.println("Not a prime");
    }
}
