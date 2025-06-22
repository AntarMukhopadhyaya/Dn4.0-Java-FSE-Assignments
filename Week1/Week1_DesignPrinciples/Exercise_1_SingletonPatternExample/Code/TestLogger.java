package Week1.Week1_DesignPrinciples.Exercise_1_SingletonPatternExample.Code;


public class TestLogger {
    public static void main(String[] args) {

        // Testing the LoggerEager implementation
        System.out.println("Testing LoggerEager Singleton Pattern:");

        LoggerEager logger1 = LoggerEager.getInstance();
        LoggerEager logger2 = LoggerEager.getInstance();
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("logger1 and logger2 are different instances.");
        }

        // Testing the LoggerLazy implementation
        System.out.println("\nTesting LoggerLazy Singleton Pattern:");
        LoggerLazy logger3 = LoggerLazy.getInstance();
        LoggerLazy logger4 = LoggerLazy.getInstance();
        logger3.log("This is the third log message.");
        logger4.log("This is the fourth log message.");
        if (logger3 == logger4) {
            System.out.println("Both logger3 and logger4 are the same instance.");
        } else {
            System.out.println("logger3 and logger4 are different instances.");
        }
    }
}
