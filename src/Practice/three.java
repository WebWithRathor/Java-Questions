package Practice;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int square = n*n;
        int sum = 0;
        while (square>0){
            int rem = square %10;
            sum+=rem;
            square = square/10;
        }
        System.out.print("The number is ");
        System.out.print(sum != n ? "is not a neon" : "is a neon");
    }
}
