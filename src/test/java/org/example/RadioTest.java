package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RadioTest {

    public void testNumberStation() {
        Radio radio = new Radio(80);
        int expected = 80;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxNumberStation() {
        Radio radio = new Radio(80);
        int expected = 79;
        int actual = radio.getMaxNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinNumberStation() {
        Radio radio = new Radio(80);
        int expected = 0;
        int actual = radio.getMinNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNumberStation2() {
        Radio radio = new Radio();
        int expected = 10;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxNumberStation2() {
        Radio radio = new Radio();
        int expected = 9;
        int actual = radio.getMaxNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinNumberStation2() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getMinNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetNextNumber() {
        Radio radio = new Radio();
        radio.setNumber(radio.getMaxNumber());
        radio.nextNumberRadio();
        int expected = radio.getMinNumber();
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetPrevNumber() {
        Radio radio = new Radio();
        radio.setNumber(radio.getMinNumber());
        radio.prevNumberRadio();
        int expected = radio.getMaxNumber();
        ;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetNextMinNumber() {
        Radio radio = new Radio();
        radio.setNumber(0);
        radio.nextNumberRadio();
        int expected = 1;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetPrevNumber2() {
        Radio radio = new Radio();
        radio.setNumber(1);
        radio.prevNumberRadio();
        int expected = 0;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetPrevMaxNumber() {
        Radio radio = new Radio();
        radio.setNumber(9);
        radio.prevNumberRadio();
        int expected = 8;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testСurrentVolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testСurrentVolumeMax2() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testСurrentVolumeMin() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testСurrentVolumeMin2() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetMinNumberBorder() {
        Radio radio = new Radio();
        radio.setNumber(-10);
        int expected = 10;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetNumberMax() {
        Radio radio = new Radio();
        radio.setNumber(50);
        int expected = 10;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetVolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(101);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetVolumeMin() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetVolumeMin2() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getMinVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetVolumeMax2() {
        Radio radio = new Radio();
        int expected = 100;
        int actual = radio.getMaxVolume();
        Assertions.assertEquals(expected, actual);
    }
}