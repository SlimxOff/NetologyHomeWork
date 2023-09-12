package netology.homework.homework8.homework8_2;

public class Main {
    public static void main(String[] args) {
        SimpleLogger simpleLogger = new SimpleLogger();
        SmartLogger smartLogger = new SmartLogger();
        simpleLogger.log("First message");
        smartLogger.log("First log");
        smartLogger.log("Second log");
        smartLogger.log("error");
        smartLogger.log("ErRoR");
        smartLogger.log("ERROR");

    }
}
