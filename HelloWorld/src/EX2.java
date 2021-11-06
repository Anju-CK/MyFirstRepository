import java.util.Scanner;
public class EX2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("what is the total bill amount?");
        int billamount= scanner.nextInt();
        System.out.println("what is the total number of people?");
        int people= scanner.nextInt();
        double amount= (billamount / people);
        System.out.println("total bill = "+billamount );
        System.out.println("everyone should contribute= "+amount);
    }
}
