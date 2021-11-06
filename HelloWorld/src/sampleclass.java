public class sampleclass {
    private int a;
    private int b;
    public sampleclass(int a, int b){
        setA( a);
        setB( b);
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public int getDisplay(){
        return(a+b);
    }
}
