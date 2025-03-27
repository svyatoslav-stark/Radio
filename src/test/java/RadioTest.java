import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio(0, 9);

    @Test
    public void testInitialStation() {
        assertEquals(0, radio.getMinStation());
        assertEquals(9, radio.getMaxStation());
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testNextStation() {

        radio.setStation(radio.getMinStation());
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());

        radio.setStation(radio.getMaxStation());
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPreviousStation() {

        radio.setStation(radio.getMaxStation());
        radio.prevStation();
        assertEquals(8, radio.getCurrentStation());

        radio.setStation(radio.getMinStation());
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testSetStation() {

        radio.setStation(5);
        assertEquals(5, radio.getCurrentStation());

        radio.setStation(10);
        assertEquals(5, radio.getCurrentStation());

        radio.setStation(-1);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testInitialVolume() {
        assertEquals(0, radio.getMinVolume());
        assertEquals(100, radio.getMaxVolume());
        assertEquals(30, radio.getCurrentVolume());
    }

    @Test
    public void testIncreaseVolume() {

        for (int i = radio.getMinVolume(); i < radio.getMaxVolume(); i++) {
            radio.increaseVolume();
        }
        assertEquals(100, radio.getCurrentVolume());

        radio.setVolume(radio.getMaxVolume());
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void testDecreaseVolume() {

        radio.setVolume(radio.getMinVolume());
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());

        radio.setVolume(radio.getMaxVolume());
        for (int i = radio.getMinVolume(); i < radio.getMaxVolume(); i++) {
            radio.decreaseVolume();
        }
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testSetVolume() {
        radio.setVolume(55);
        assertEquals(55, radio.getCurrentVolume());

        radio.setVolume(101);
        assertEquals(55, radio.getCurrentVolume());

        radio.setVolume(-1);
        assertEquals(55, radio.getCurrentVolume());
    }
}

