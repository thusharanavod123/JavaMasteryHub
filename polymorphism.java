import oop.inheritance.Animal;

public class polymorphism {


    class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound...");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Sum (int): " + math.add(5, 10));
        System.out.println("Sum (double): " + math.add(3.5, 2.5));

        Animal myCat = new Cat();
        myCat.makeSound();
    }
}

    
}
