package zadanie1_2;

import java.time.LocalDate;

public class MeetingTest {
    public static void main(String[] args) {
        Meeting meeting = new Meeting("opis", "adres");
        Meeting meeting2 = new Meeting("opis2", LocalDate.now().plusDays(2), "adres2", 20);

        System.out.println(meeting.opisSpotkania());
        System.out.println(meeting2.opisSpotkania());
    }
}
