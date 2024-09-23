// Define an interface
interface Animal {
    // Method declarations without body (abstract methods)
    void makeSound();
    void eat();
}

// Class that implements the interface
class Dog implements Animal {
    // Provide implementation of the interface methods
    public void makeSound() {
        System.out.println("Woof Woof");
    }
    
    public void eat() {
        System.out.println("Dog is eating");
    }
}

class Cat implements Animal {
    // Provide implementation of the interface methods
    public void makeSound() {
        System.out.println("Meow Meow");
    }

    public void eat() {
        System.out.println("Cat is eating");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        // Create objects of classes implementing the interface
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call methods
        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();
    }
}
