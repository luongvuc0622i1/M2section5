package accessModifier2;

public class Demo {
    public static void main(String[] args) {
        Student Luong = new Student();
        Student Phong = new Student();

        Luong.setName("Luong");
        Luong.setClasses("C06");
        Luong.display();
        Phong.display();

    }

}
