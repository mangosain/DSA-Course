public class Constructors {
    public static void main(String[] args) {
        Animal obj = new Animal("Pink");
        System.out.println(obj.color);
    }
}

class Animal {
    String color;

    Animal(String color) {
        this.color = color;
    }
}