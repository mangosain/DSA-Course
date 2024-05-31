public class CopyConstructor {
    public static void main(String[] args) {
        Animal obj1 = new Animal("Pink");
        System.out.println(obj1.color);

        Animal obj2 = new Animal(obj1);
        System.out.println(obj2.color);
    }
}

class Animal {
    String color;

    Animal(String color) {
        this.color = color;
    }

    Animal(Animal obj) {
        this.color = obj.color;
    }
}