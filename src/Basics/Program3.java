package Basics;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int a = sc.nextInt();
        System.out.println("Enter the name : ");
        sc.nextLine();
        String b = sc.nextLine();
        System.out.println("Your age is " +a+"and name is "+b );
    }
}
