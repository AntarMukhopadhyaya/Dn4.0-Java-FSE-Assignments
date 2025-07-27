package Week1.Week1_DesignPrinciples.Exercise_1_SingletonPatternExample.Code;
class LoggerEager {
    // Eager creation of the instance
    private static LoggerEager instance = new LoggerEager();

    private LoggerEager() {

    }
    // Returns the instance of the class
    public static LoggerEager getInstance() {
        return instance;
    }
    // Method to log messages
    public void log(String message) {
        System.out.println("Log: " + message);
    }

}