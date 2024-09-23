abstract class Animal{
    abstract void Sound();
    public void eats(){
        System.out.println("Eating the food");
    }
}
class Dog extends Animal{
    public void Sound(){
        System.out.println("Bhaw Bhaw");
    }
}
class AbstractionExample {
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.eats();
        obj.Sound();
    }    
}
