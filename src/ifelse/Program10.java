package ifelse;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        if (age > 18)
            System.out.println("Valid");
        else
            System.out.println("invalid will be valid after" + (18-age) + " years.");
    }
}
