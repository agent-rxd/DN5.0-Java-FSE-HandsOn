public class Logger{

    private static volatile Logger instance;

    private Logger(){
        System.out.println("Logger instance created");
    }

    // Not thread-safe
    /*public static Logger getInstance(){
        if(instance==null){
            instance = new Logger();
        }
        return instance;
    }*/

    //use synchronized - Performace degrades for more threads
    /*public static synchronized Logger getInstance(){
        if(instance==null){
            instance = new Logger();
        }
        return instance;
    }*/

    //double-check
    public static Logger getInstance(){
        Logger localInstance = instance; // to reduce volatile reads
        if(localInstance==null){
            synchronized (Logger.class){ // thread-safety
                if(localInstance==null) localInstance = new Logger();
            instance = localInstance;
            }
        }
        return localInstance;
    }

    //Eager initialization
    //-- object created when class loaded in jvm
    /* private static final Logger instance = new Logger(); */
    
}
