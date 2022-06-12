package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(10);

    @Test
    void currentStation() {
        radio.setCurrentStation(8);
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void nextStation() {
        radio.setCurrentStation(8);
        radio.setNextStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void stationInBack() {
        radio.setCurrentStation(8);
        radio.setPrevStation();
        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    void prevStationThrowMaxStation() {
        radio.setCurrentStation(0);
        radio.setPrevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void ShouldMinStation() {
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void nextStationThrowMinStation() {
        radio.setCurrentStation(9);
        radio.setNextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void ShouldMaxStation() {
        radio.setCurrentStation(12);
        Assertions.assertEquals(9,radio.getCurrentStation());
    }

    @Test
    void currentVolume() {
        radio.setCurrentVolume(9);
        Assertions.assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    void upVolume() {
        radio.setCurrentVolume(6);
        radio.setUpVolume();
        Assertions.assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    void upVolumeShouldMaxVolume() {
        radio.setCurrentVolume(100);
        radio.setUpVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void upVolumeThrowMaxVolume() {
        radio.setCurrentVolume(105);
        radio.setUpVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void downVolume() {
        radio.setCurrentVolume(1);
        radio.setDownVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void downVolumeThrowMin() {
        radio.setCurrentVolume(-1);
        radio.setDownVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void inputNumberStation() {
        radio.inputNumberStation(15);
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void getInputNumberStation() {
        radio.inputNumberStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void getInputNumberStationThrowMin() {
        radio.inputNumberStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }
}