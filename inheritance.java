package oop;

public class inheritance {
    

    class Animal {
        String name;
    
        public void eat() {
            System.out.println(name + " is eating...");
        }
    }
    
    class Dog extends Animal {
        public void bark() {
            System.out.println(name + " is barking...");
        }
    }
    
    public class inheritance {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.name = "Buddy";
            dog.eat();
            dog.bark();
        }
    }
    
}
