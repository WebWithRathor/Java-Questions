package Basics;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 that to be swaped : ");
        int a = sc.nextInt();
        System.out.println("Enter the number 2 that to be swaped : ");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b= temp;
        System.out.println("After swapping a = " +a+" & b = " + b);
    }
}
