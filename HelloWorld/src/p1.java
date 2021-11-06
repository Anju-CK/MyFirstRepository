public class p1 {
    public static void main(String[] args){
        int n=2;
        boolean isprime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isprime =false;
                break;
            }}
            if(isprime)
            {
                System.out.print(n+" "+"is prime");
            }
            else{
                System.out.print(n+" "+"not isprime");
            }
        }
    }

