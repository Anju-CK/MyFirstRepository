package example1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Task extends Thread{
    //constructor is created for easy differentiation of tasks
    private int number;
    public Task(int number){
        this.number=number;
    }
    public void run(){
        System.out.print("\nTask"+number+" Started");
        for (int i = number*100; i <= number*100+199; i++) {
            System.out.print(i+" ");
        }
        System.out.print("\nTask"+number+" Done");
    }
}

public class ExecutorServiceRunner {
    public static void main(String[] args){
      //  ExecutorService executorService= Executors.newSingleThreadExecutor();
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.shutdown();

    }
    
}
