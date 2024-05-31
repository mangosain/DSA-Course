public class GettersAndSetters {
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.setColor("Pink");
        System.out.println(obj.getColor());
    }
}

class Animal {
    String color;

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }
}