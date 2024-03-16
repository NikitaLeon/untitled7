import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio rad = new Radio();
        rad.currentStation = 5;
        int expected = 5;
        int actual = rad.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minStation() {
        Radio rad = new Radio();
        rad.minStation();
        int expected = 0;
        int actual = rad.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxStation() {
        Radio rad = new Radio();
        rad.maxStation();
        int expected = 9;
        int actual = rad.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio rad = new Radio();
        rad.nextStationAfterMax(1);
        int expected = 2;
        int actual = rad.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextSetStationAfterMaxIfMax() {
        Radio rad = new Radio();
        rad.nextStationAfterMax(9);
        int expected = 0;
        int actual = rad.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio rad = new Radio();
        rad.prevStation(2);
        int expected = 1;
        int actual = rad.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationBeforeMin() {
        Radio rad = new Radio();
        rad.prevStation(0);
        int expected = 9;
        int actual = rad.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);
        int expected = 8;
        int actual = rad.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationIfMore() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        int expected = 0;
        int actual = rad.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationIfLess() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.currentStation;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolume() {
        Radio rad = new Radio();
        rad.currentVolume = 50;
        int expected = 50;
        int actual = rad.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        Radio rad = new Radio();
        rad.minVolume();
        int expected = 0;
        int actual = rad.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxVolume() {
        Radio rad = new Radio();
        rad.maxVolume();
        int expected = 100;
        int actual = rad.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio rad = new Radio();
        rad.increaseVolume(2);
        int expected = 3;
        int actual = rad.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAfterMax() {
        Radio rad = new Radio();
        rad.increaseVolume(100);
        int expected = 100;
        int actual = rad.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio rad = new Radio();
        rad.decreaseVolume(13);
        int expected = 12;
        int actual = rad.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeBeforeMin() {
        Radio rad = new Radio();
        rad.decreaseVolume(0);
        int expected = 0;
        int actual = rad.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

}
