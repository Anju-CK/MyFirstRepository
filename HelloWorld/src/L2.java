import java.util.Scanner;
public class L2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nam = new String[10];
        nam[0] = "Michelle";
        nam[2] = "Molly";
        nam[3] = "Christoper";
        nam[4] = "Clara";

       // System.out.print("Name : ");
      //  String Name = scanner.next();
        for (int i = 0; i < nam.length; i++) {
            System.out.print((i+1)+"."+" ");
            if (nam[i] != null) {
                System.out.println(nam[i]);
                }
            }
        }
    }
