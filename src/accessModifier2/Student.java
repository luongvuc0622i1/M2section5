package accessModifier2;

public class Student {
    private String name;
    private String classes;

    public Student() {
        name = "John";
        classes = "C02";
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
    public void display(){
        System.out.println("Tên " + this.name + " lớp: " + this.classes);
    }
}
