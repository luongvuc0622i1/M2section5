package staticMethod;

public class Test {
    public static void main(String args[]) {
        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(111, "Luong");
        Student s2 = new Student(222, "Phong");
        Student s3 = new Student(333, "Huy");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
