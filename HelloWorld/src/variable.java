package first;
import java.util.Scanner;


public class variable {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);

        System.out.println("name?");
        String name= a.nextLine();
        System.out.println("your name is "+name);

        System.out.println("age?");
        int age= a.nextInt();
        System.out.println("your age is "+age);

        System.out.println("height?");
        double height= a.nextDouble();
        System.out.println("your height is "+height);


    }
}
