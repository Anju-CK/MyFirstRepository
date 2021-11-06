import java.util.Scanner;
public class L1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        String[] guest = new String[6];
        guest[0] = "anu";
        guest[1] = "anju";
        guest[2] = "ammu";
        guest[3] = "alwin";

        do {
            System.out.println();
            System.out.println("1. displying all guest");
            System.out.println("2. adding guest");
            System.out.println("3. removing guest");
            System.out.println("4. exit");
            System.out.print("choose your option:");
            int option = scanner.nextInt();
            System.out.println();
            if (option == 1) {
                for ( i = 0; i < guest.length; i++) {
                    System.out.println(guest[i]);}
                    //guest[i]=scanner.next();
                    break;
                }
             else if (option == 2) {
                for ( i = 0; i < guest.length; i++) {
                    if (guest[i] == null) {

                        System.out.print("name: ");
                        guest[i] = scanner.next();
                        break;
                    }
                }
            } else if (option == 3) {
                System.out.print("name: ");
                String name = scanner.next();
                for ( i = 0; i < guest.length; i++) {
                    if (guest[i] != null && guest[i].equals(name)) {
                        guest[i] = null;
                        break;
                    }
                }
            } else if (option == 4) {
                System.out.println("exiting.....");
                break;
            }

        } while (true);
    }
}