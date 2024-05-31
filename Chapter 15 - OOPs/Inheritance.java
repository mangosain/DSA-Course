public class Inheritance {
    public static void main(String[] args) {
        Animal obj = new Animal("Pink");
        System.out.println(obj.color);

        Horse horse = new Horse("Blue", "Balls");
        System.out.println(horse.color);
        System.out.println(horse.name);
    }
}

class Animal {
    String color;

    Animal(String color) {
        this.color = color;
    }
}

class Horse extends Animal {
    String name;

    Horse(String color, String name) {
        super(color);
        this.name = name;
    }
}