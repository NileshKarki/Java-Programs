class Animal { 
    void display() { 
        System.out.println("Animal display"); 
    } 
} 

class Dog extends Animal { 
    @Override 
    void display() { 
        super.display(); // Calling superclass method using "super" 
        System.out.println("Dog display"); 
    } 
}
class Rough{
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.display();
    }
}