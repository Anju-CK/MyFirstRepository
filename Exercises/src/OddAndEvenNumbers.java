class Even extends Thread{
    public void run(){
        System.out.print("\n Even Numbers Started");
        for (int i=1; i <=50; i++) {
            if(i%2==0)
            System.out.print(i+" ");
        }
        System.out.print("\nEven Numbers Finished");
    }
}
class Odd extends Thread{
    public void run(){
        System.out.print("\n Odd Numbers Started");
        for (int i=1; i <=50; i++) {
            if(i%2==1)
                System.out.print(i+" ");
        }
        System.out.print("\nOdd Numbers Finished");
    }
}
public class OddAndEvenNumbers {

    public static void main(String[] args) {
        System.out.print("\nEven Numbers Kicked off");
        Even even = new Even();
        even.start();

        System.out.print("\nOdd Numbers Kicked off");
        Odd odd = new Odd();
        odd.start();
        System.out.print("\nMain Done");
    }
}
