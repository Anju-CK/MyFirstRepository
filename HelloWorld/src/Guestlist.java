import java.util.Scanner;

public class Guestlist {
    static String[] guest = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        insertTestName();
        do {
            displayGuests();
            displayMenu();
            int option = getOption();
            if (option == 1) {
                addGuest();
            } else if (option == 2) {
                renameguest();
            } else if (option == 3) {
                removeGuest();
            } else if (option == 4) {
                System.out.println("exiting.....");
                break;
            }
            else if(option==5){
                insertguest();
            }
        } while (true);
    }


    static void displayGuests() {
        System.out.println("______________________");
        System.out.println("-guest-");
        boolean isempty = true;
        //System.out.println("guest list is empty");
        for (int i = 0; i < guest.length; i++) {
            if (guest[i] != null) {
                System.out.println((i + 1) + "." + " " + guest[i]);
                isempty = false;
            }
            if (isempty) {
                System.out.println("guest list is empty");
                break;
            }
        }
    }

    static void displayMenu() {
        System.out.println();
        System.out.println("______________________");
        System.out.println("-menu-");
        System.out.println();

        System.out.println("1. adding guest");
        System.out.println("2. rename guest");
        System.out.println("3. remove guest");
        System.out.println("4. exit");
    }

    static int getOption() {
        System.out.print("choose your option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return option;
    }

    static void addGuest() {
        for (int i = 0; i < guest.length; i++) {
            if (guest[i] == null) {
                System.out.print("name: ");
                guest[i] = scanner.nextLine();
                break;
            }
        }
    }

    static void removeGuest() {
        System.out.print("number: ");
        int number = scanner.nextInt();
        if (number >= 1 && number <= 10 && guest[number - 1] != null) {
            guest[number - 1] = null;
            /*for (int i = 0; i < guest.length; i++) {
                if (guest[i] != null && guest[i].equals(name)) {
                    guest[i] = null;
                    break;
                }
            }*/
            String[] temp = new String[guest.length];
            int j = 0;
            for (int i = 0; i < guest.length; i++) {
                if (guest[i] != null) {
                    temp[j] = guest[i];
                    j++;
                }
            }
            guest = temp;
        } else {
            System.out.println("error,there is no such number");
        }
    }

    static void insertTestName() {
        guest[0] = "anu";
        guest[1] = "anju";
        guest[2] = "ammu";
        guest[3] = "alwin";
        guest[4] = "abhi";
    }

    static void renameguest() {
        System.out.print("number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("name: ");
        String name = scanner.nextLine();
        if (number >= 1 && number <= 10 && guest[number - 1] != null) {
            guest[number - 1] = name;
        } else {
            System.out.println("no such number");
        }

    }
    static void insertguest(){
        System.out.print("number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        if (number >= 1 && number <= 10 && guest[number - 1] != null){
        System.out.print("name: ");
        String name = scanner.nextLine();
        for(int i=guest.length-1;i>number-1;i--){
            guest[i]=guest[i-1];
        }
            guest[number - 1] = name;
        } else {
            System.out.println("no such number");
        }
    }
}


