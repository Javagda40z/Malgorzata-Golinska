package zadanie1_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


class MeetingTest {

    private Meeting meeting;

    @BeforeEach // adnotacja, która mów JUnit, że ma to się wykonać przed każdym testem
    void setUp() {
        meeting = new Meeting("opis", "description");
    }

    @Test
    void testIfDefaultDateIsNow() {

        LocalDate now = LocalDate.now();
        LocalDate date = meeting.getDate();
        if (now.equals(date)) {
            //
        } else {
            //
        }
        assertEquals(LocalDate.now(), meeting.getDate(), "Domyślna data powinna być dzisiejsza!");
        assertTrue(now.equals(date));
        assertFalse(!now.equals(date));
    }

    @Test
    void testIfDefaultRoomCapacityIs18() {

        assertEquals(18, meeting.getSize());
    }

    @Test
    void testWhenDelayingMeeting() {
        meeting.delayMeeting(5);
        assertEquals(LocalDate.now().plusDays(5), meeting.getDate());
    }

}