package whileloop;

import java.util.Scanner;

public class Program34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>0){
            int rem = n%10;
            n=n/10;
        }
    }
}
