package loops;

import java.util.Scanner;

public class Program25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumFac =n;
        for (int i = 1; i <= n/2 ; i++) {
            if(n%i ==0){
                sumFac+=i;
                System.out.print(i + " + ");
            }
        }
        System.out.print(n + " = " + sumFac);
        System.out.println("\nSum of the factors is " + sumFac);
    }
}
