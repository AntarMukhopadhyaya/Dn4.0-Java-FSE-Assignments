package Week1.DesignPrinciples.SingletonPatternExample;

public class LoggerLazy {
    private static LoggerLazy instance;
    // Private constructor prevents instantiation from other classes
    private LoggerLazy(){

    }
    //Create the instance only when it is needed.
    public static LoggerLazy getInstance(){
        if(instance == null){
            instance = new LoggerLazy();
        }
        return instance;
    }
    // Method to log messages
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
