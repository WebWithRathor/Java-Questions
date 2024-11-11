package OOPs;

public class Student {
    String name;
    int age;
    String CollegeName;

    // constructor overloading or constructor runtime polymorphism same goes with method
    public Student() {
    }

    public Student(String name, int age, String collegeName) {
        this.name = name;
        this.age = age;
        this.CollegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Student {" + "\n" +
                "name : '" + name + '\'' + "," + "\n" +
                "age : " + age + "," + "\n" +
                "CollegeName : '" + CollegeName + '\'' + "," + "\n" +
                '}';
    }
}
