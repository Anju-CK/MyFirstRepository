import java.util.Scanner;
public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass;

        do {
            System.out.println("enter password= ");
            pass = scanner.next();
        }while (!pass.equals("shark50"));
        System.out.println("Acess Granted ");
    }

}
