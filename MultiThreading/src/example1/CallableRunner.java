package example1;

import java.util.concurrent.*;

//class returning a value
class callableTask implements Callable<String> {
    private String name;
    public callableTask(String name){
        this.name=name;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello "+name;
    }
}
public class CallableRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        Future<String> welcomeFuture=executorService.submit(new callableTask("in28Minutes"));
        System.out.print("\nnew callableTask(\" in 28Minutes \")executed");
        String welcomeMessage=welcomeFuture.get();
        System.out.println(welcomeMessage);
        System.out.print("\n Main Completed");
    }
}
