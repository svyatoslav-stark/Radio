import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void testInitialStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void testNextStation() {
        Radio radio = new Radio();

        radio.setStation(0);
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());

        radio.setStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void testPreviousStation() {
        Radio radio = new Radio();

        radio.setStation(9);
        radio.prevStation();
        assertEquals(8, radio.getCurrentStation());

        radio.setStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void testSetStation() {
        Radio radio = new Radio();
        radio.setStation(5);
        assertEquals(5, radio.getCurrentStation());

        radio.setStation(10);
        assertEquals(5, radio.getCurrentStation());

        radio.setStation(-1);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testInitialVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void testIncreaseVolume() {
        Radio radio = new Radio();

        for (int i = 0; i < 100; i++) {
            radio.increaseVolume();
        }
        assertEquals(100, radio.getCurrentVolume());

        radio.setVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void testDecreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());

        radio.setVolume(100);
        for (int i = 0; i < 100; i++) {
            radio.decreaseVolume();
        }
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void testSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(55);
        assertEquals(55, radio.getCurrentVolume());

        radio.setVolume(101);
        assertEquals(55, radio.getCurrentVolume());

        radio.setVolume(-1);
        assertEquals(55, radio.getCurrentVolume());
    }
}

