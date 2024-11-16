package Practice;

import java.util.Scanner;

public class Fint_Prime_FActors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shape = sc.next();
        switch(shape){
            case "circle" ->{
                double r = sc.nextDouble();
                System.out.println(Math.PI * r*r);
            }
            case "rectangle" ->{
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println(l*b);
            }
            case "triangle" ->{
                double h = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println(b*h*0.5);
            }
            default ->
                System.out.println("Invalid shape");


        }
    }
}
