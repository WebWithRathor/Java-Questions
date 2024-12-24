package OOPs.ConstructorChaining;

// in same class
class Parent {
    Parent(int a) {
        System.out.println("DEFAULT PARENT ");
    }
}

public class Student extends Parent {

    Student(int a) {
        super(a);
        System.out.println("Default constructor ");
    }

    public static void main(String[] args) {
        Student obj = new Student(10);
    }
}
