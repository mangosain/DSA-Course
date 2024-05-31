
public class Basics {
    public static void main(String[] args) {
        Animal obj1 = new Animal();
        obj1.color = "Pink";
        obj1.feet = 2;

        System.out.println(obj1.color);
        System.out.println(obj1.feet);
    }
}

class Animal {
    String color;
    int feet;
}
