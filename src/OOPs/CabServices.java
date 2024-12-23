package OOPs;
import java.util.Scanner;
public class CabServices {
    double km,bill;
    String Car_Type;
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the car type AC or Non-AC : ");
        Car_Type = sc.nextLine();
        System.out.print("Enter Km : ");
        km = sc.nextDouble();
    }
    void calculate(){
        if(Car_Type.equals("AC")){
            if(km<=5) bill = 150;
            bill = 150 + (km-5)*10;
        }else{
            if(km<=5) bill = 120;
            bill = 120 + (km-5)*8;

        }
    }
    void display(){
        System.out.println("Bill = " + bill);
        System.out.println("Car_Type = " + Car_Type);
        System.out.println("Km = " + km);
    }
    public static void main(String[] args) {
        CabServices cs = new CabServices();
        cs.accept();
        cs.calculate();
        cs.display();
    }
}
