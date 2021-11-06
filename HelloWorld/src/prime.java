public class prime {
    public static void main(String[] args) {

        for (int n = 2; n < 10; n++) {
            boolean isprime = true;
            for (int d = 2; d < n; d++) {
               if(n%d==0){
                isprime = false;
                break;
            }
        }
            if (isprime) {
                System.out.println(n);
            }
        }
    }
}
