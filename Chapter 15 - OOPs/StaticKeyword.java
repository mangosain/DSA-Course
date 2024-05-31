public class StaticKeyword {
    public static void main(String[] args) {
        Student std0 = new Student("Hello");
        Student std1 = new Student("World");
        Student std2 = new Student("!!!");

        Student.schoolName = "School Name";

        System.out.println(std0.name + " " + Student.schoolName);
        System.out.println(std1.name + " " + Student.schoolName);
        System.out.println(std2.name + " " + Student.schoolName);
    }
}

class Student {
    String name;
    static String schoolName;

    Student(String name) {
        this.name = name;
    }
}