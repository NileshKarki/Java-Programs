public class NestedLoop {
    public static void main(String[] args) {
        int a=7,b=6,c=13;
        if(a>b && a>c){
            if(a>c){
                System.out.println("A is greater than other values");
            }
        }
        else if(b>c){
            System.out.println("B is greater then other values");
        }
        else{
            System.out.println("C is greater then other values");
        }
    }
}
