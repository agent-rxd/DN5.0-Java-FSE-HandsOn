public class SingletonTest {
    public static void main(String args[]){
        Runnable task = () -> {
            Logger instance = Logger.getInstance();
            System.out.println(Thread.currentThread().getName() + " "+instance.hashCode());
        };

        //starting 2 threads at same time
        Thread t1 = new Thread(task,"Thread-1");
        Thread t2 = new Thread(task,"Thread-2");
        t1.start();
        t2.start();
    }
}
