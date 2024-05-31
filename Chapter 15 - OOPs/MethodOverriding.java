public class MethodOverriding {
    public static void main(String[] args) {
        Animal obj1 = new Animal();
        obj1.eat();

        Horse obj2 = new Horse();
        obj2.eat();

        Animal obj3 = new Horse();
        obj3.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("Eat anything");
    }
}

class Horse extends Animal {
    void eat() {
        System.out.println("Eat grass");
    }
}