package ObjectOrientedProgramming;

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal {
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {

    @Override
    void walk() {
        System.out.println("walk on 4 legs");
    }
}

class Chicken extends Animal {

    @Override
    void walk() {
        System.out.println("walk on 2 legs");
    }
}