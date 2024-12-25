package OOPs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class StudentManagement {
    int studentId;
    String name;
    int age;
    String grade;
    HashMap<String, Integer> marks = new HashMap<>();
    double Percentage;

    void accept() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("studentId : ");
        studentId = Integer.parseInt(br.readLine());
        System.out.print("name : ");
        name = br.readLine();
        System.out.print("age : ");
        age = Integer.parseInt(br.readLine());
        System.out.print("grade : ");
        grade = br.readLine();
        System.out.println("Marks of subjects out of 100 are :");
        System.out.print("Maths :");
        marks.put("Maths", Integer.parseInt(br.readLine()));
        System.out.print("English :");
        marks.put("English", Integer.parseInt(br.readLine()));
        System.out.print("Science :");
        marks.put("Science", Integer.parseInt(br.readLine()));
    }

    void calculate (){
        for(int mark : marks.values())Percentage += mark;
        Percentage = Percentage/400;
    }

    

    public static void main(String[] args) throws IOException {
    }


}
