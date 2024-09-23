import java.util.Scanner;
public class ArrayByLoop{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number for size of array");
        int n=scan.nextInt();
        int []array=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the " +(i + 1) + " number");
            array[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("The value is "+array[i]);
        }
        scan.close();
    }
}