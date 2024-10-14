package whileloop;

import java.util.Scanner;

public class Program29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem ;
        while (n>0){
            rem =  n % 10;
            System.out.println(rem);
            n=n/10;
        }
    }
}
