
    import java.util.concurrent.*;

    class RunnableI implements Runnable {
        public void run() {
            System.out.println("Runnable ");
        }
    }
    
    class CallableI implements Callable {
    
        @Override
        public Integer call() throws Exception {
            return 5;
        }
    }
    
    
    public class Answer4 {
        static ExecutorService ex = Executors.newFixedThreadPool(2);
    
        public static void main(String[] args) throws ExecutionException, InterruptedException {
            RunnableI t1 = new RunnableI();
            Thread th = new Thread(t1);
    //        CallableI c1 = new CallableI();    /for Callable
        //    Future<Integer> num = ex.submit(c1);
    //        System.out.println(num.get());
            th.start();
            ex.submit(new RunnableI());
    
    
        }
    }
