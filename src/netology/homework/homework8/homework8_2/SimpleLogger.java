package netology.homework.homework8.homework8_2;

import netology.homework.homework8.homework8_2.Logger;

import java.time.LocalDateTime;

public class SimpleLogger implements Logger {
    @Override
    public void log(String msg) {
        System.out.println("["+ LocalDateTime.now()+"] " + msg);
    }
}
