package Basics;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and width of rec : ");
        int l = sc.nextInt();
        int w = sc.nextInt();
        System.out.println("Area of rectange is : " + (l*w));
    }
}
