import java.util.Scanner;
public class A2 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter top 5 favourite foods:");
        String[] names=new String[3];
        for(int i=0;i<names.length;i++){

            System.out.print("food "+ (i+1) +":"+" ");
            names[i]=scanner.nextLine();
        }
        System.out.println("no more memory available");

        System.out.println("your favourite foods are:");
        for(int i=0;i<names.length;i++) {

            System.out.println("food " + (i + 1) + ":" + " " + names[i]);
        }

    }
}
