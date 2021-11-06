public class WhileNumberPlayer {
    private int limit;
    public WhileNumberPlayer(int limit) {
        this.limit = limit;
    }
    //for limit 30,output will be 1 4 9 16 25
    public  void printSquaresUptoLimit(){
        int i=1;
        while(i*i<limit){
            System.out.print(i*i +" ");
            i++;
        }

    }
    //for limit 30,output will be 1 8 27
    public void printCubesUptoLimit(){
        int i=1;
        while((i*i*i)<limit){
            System.out.print(i*i*i +" ");
            i++;
        }

    }



}
