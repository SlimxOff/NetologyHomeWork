package netology.homework.homework4;

import java.util.ArrayList;

public class pattern {
    public static final String TEXT = "aaababaabaaaabaabaabaabaaababaabaaababaabaaaabaabaabaabbabaabaaababaababaabaabaabaaabbaab";
    public static final String PATTERN = "aab";


    public static boolean isConsist(String c) {
        return c.equals(PATTERN);
    }


    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (int i = 0; i < TEXT.length(); i++) {
            if (i<TEXT.length()-2){
            stringBuilder.append(TEXT.charAt(i));
            stringBuilder.append(TEXT.charAt(i+1));
            stringBuilder.append(TEXT.charAt(i+2));
            if (isConsist(stringBuilder.toString())) {
                count++;
                stringBuilder.delete(0,3);}
            else {
                stringBuilder.delete(0,3);}
        }
        }
        System.out.println("Строка " + PATTERN + " встретилась в тексте " + count + " раз");
    }
}
