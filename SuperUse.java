class Animal {
    int a,b;
    Animal(){
        this.a=5;
        this.b=6;
        System.out.println(a+b);
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("The Answer is above");  
    }
}
class SuperUse {
    public static void main(String[] args) {
        Dog obj=new Dog();
        Animal obj1=new Animal();
        System.out.println(obj.a);
        System.out.println(obj1.a);
    }    
}
