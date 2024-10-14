package Switch;

import java.util.Scanner;

public class Program44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1.Indian\n2.Italian\n3.Spanish\n0.Exit");
            System.out.println("Enter the Choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
            System.out.println("1.Idli Sambar\n2.Dal fry\n3.Paneer\n0.Exit");
            System.out.println("Enter the Choice : ");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1 -> {
                            System.out.println("Your Choice : Idli sambar");
                        }
                        case 2 -> {
                            System.out.println("Your Choice : Dal fry");
                        }
                        case 3 -> {
                            System.out.println("Your Choice : Paneer");
                        }
                    }
                }
                case 2 -> {
            System.out.println("1.Pasta\n2.Pizza\n3.Lazania\n0.Exit");
            System.out.println("Enter the Choice : ");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1 -> {
                            System.out.println("Your Choice : Pasta");
                        }
                        case 2 -> {
                            System.out.println("Your Choice : Pizza");
                        }
                        case 3 -> {
                            System.out.println("Your Choice : Lazania");
                        }
                    }
                }
                case 3 -> {
                    System.out.println("1.Hotdog\n2.Spanish2\n3.Spanish3\n0.Exit");
                    System.out.println("Enter the Choice : ");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1 -> {
                            System.out.println("Your Choice : Hotdog");
                        }
                        case 2 -> {
                            System.out.println("Your Choice : spanish2");
                        }
                        case 3 -> {
                            System.out.println("Your Choice : Spanish3");
                        }
                    }
                }
            }
            System.out.println();
        } while (ch != 0);
    }
}
