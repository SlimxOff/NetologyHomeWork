package netology.homework.homework8.homework8_2;

import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    int number = 1;

    @Override
    public void log(String msg) {
        if (msg.toLowerCase().equals("error")) {
            System.out.println("ERROR#" + number + "[" + LocalDateTime.now() + "] " + msg);
        } else {
            System.out.println("INFO#" + number + "[" + LocalDateTime.now() + "] " + msg);
        }
        number++;
    }

}
