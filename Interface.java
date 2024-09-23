/**
 * InnerInterface
 */
interface Animal {
    abstract void sound();
    abstract void eats();
}

class Dog implements Animal{
    @Override
     public void sound(){
        System.out.println("Bhaw Bhaw");
    }
    public void eats(){
        System.out.println("Dog is eating");
    }
}
public class Interface {
    public static void main(String[] args) {
        // Animal obj1=new Animal(); // We can't create a object of interface
        Dog obj=new Dog();
        obj.sound();
    }  
}
