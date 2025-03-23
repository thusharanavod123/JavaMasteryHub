package oop;

import oop.inheritance.Dog;

public class abstraction {
    abstract class Vehicle {
    abstract void startEngine();

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started...");
    }
}

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.stopEngine();

        Animal myDog = new Dog();
        myDog.makeSound();
    }
}

}
