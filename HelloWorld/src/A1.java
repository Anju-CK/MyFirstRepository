public class A1 {
    public static void main(String[] args) {
        double sum=0;
        double[] n = new double[5];
        n[0]=2.3;
        n[1]=6.43;
        n[2]=5.5;
        n[3]=8.9;
        n[4]=5.4;
        for(int i=0;i<n.length;i++) {
            sum += n[i];
        }
                System.out.println("sum is= "+ sum);
                 double average=(sum/n.length);
                System.out.println("average is= "+ average);



    }
}




