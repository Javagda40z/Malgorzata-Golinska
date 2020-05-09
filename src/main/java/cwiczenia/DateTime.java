package cwiczenia;

import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        String text = dateTime.toString();
        System.out.println(text);
    }
}
