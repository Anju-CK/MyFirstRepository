import java.util.Scanner;
public class MenuDesign {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int Number1=scanner.nextInt();
        System.out.print("Enter Number2: ");
        int Number2=scanner.nextInt();
        System.out.println("Choices Available are:");
        System.out.println("1-Add");
        System.out.println("2-Subtract");
        System.out.println("3-Divide");
        System.out.println("4-Multiply");
        System.out.print("Enter Choice: ");
        int Choice=scanner.nextInt();

        System.out.println("Your choices are:");
        System.out.println("Number1: "+Number1);
        System.out.println("Number2: "+Number2);
        System.out.println("Choice: "+Choice);


          switch(Choice){
              case 1: System.out.println("Result= "+(Number1+Number2));
              break;
              case 2:System.out.println("Result= "+(Number1-Number2));
              break;
              case 3:System.out.println("Result= "+(Number1/Number2));
              break;
              case 4:System.out.println("Result= "+(Number1*Number2));
              break;
              default:System.out.println("Invalid Choice");
              break;
          }
        }
}
