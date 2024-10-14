package Practice;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        do {
            System.out.println("Menu\n1.Rect\n2.Circ\n3.Triangle\n4.Square\n0.Exit");
            System.out.print("Enter the choice : ");
             n = sc.nextInt();
            switch (n) {
                case 1 -> {
            System.out.print("Enter the length : ");
                    int l = sc.nextInt();
            System.out.print("Enter the breadth : ");
                    int b = sc.nextInt();
                    System.out.println("Area of rect : " + (l * b));
                }
                case 2 -> {
            System.out.print("Enter the Radius : ");
                    int r = sc.nextInt();
                    System.out.println("Area of circle : " + (Math.PI * r * r));
                }
                case 3 -> {
            System.out.print("Enter the Values of base : ");
                    int b = sc.nextInt();
            System.out.print("Enter the Values of height : ");
                    int h = sc.nextInt();
                    System.out.println("Area of triangle : " + (0.5 * b * h));
                }     case 4 -> {
            System.out.print("Enter the Values of side : ");
                    int b = sc.nextInt();
                    System.out.println("Area of square : " + (b * b));
                }
                case 0-> System.out.println("thank You for Seeing !!");
                default -> System.out.println("Invalid choice");
            }
            System.out.println();
        } while (n != 0);


    }
}
