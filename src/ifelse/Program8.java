package ifelse;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextLine().charAt(0);
        if(g=='M' && g=='m')
            System.out.println("Hello mister");
        else if(g=='F' && g=='f')
            System.out.println("Hello mam");
    }
}
