package OOPs;

import java.util.Scanner;

public class RailwayService {
    String name ;
    String coach ;
    long mob_no;
    int amt;
    int totalAmt;
    void accept(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the name : ");
        name = sc.nextLine();
        System.out.print("Enter the coach : ");
        coach = sc.nextLine();
        System.out.print("Enter the mobile number : ");
        mob_no = sc.nextLong();
        System.out.print("Enter the Amount : ");
        amt = sc.nextInt();
    }
    void update(){
        if(coach.equals("First")) totalAmt = amt + 700;
        else if(coach.equals("Second")) totalAmt = amt + 500;
        else if(coach.equals("Third")) totalAmt = amt + 250;
        else totalAmt = amt;
    }
    void display(){
        System.out.println("Name = " + name);
        System.out.println("mobile number = " + mob_no);
        System.out.println("coach = " + coach);
        System.out.println("total Amount = " + totalAmt);
    }
    public static void main(String[] args) {
        RailwayService rs = new RailwayService();
        rs.accept();
        rs.update();
        rs.display();
    }
}
