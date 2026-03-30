class Student {
    String name;
    int age;

    void show() {
        System.out.println(name + " " + age);
    }
}
public class Main_02 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Sachin";
        s.age = 21;
        s.show();
    }
}
