package org.example;

public class Radio {
    private int number = 10;
    private int volume;
    private int maxNumber = 9;
    private int minNumber = 0;
    private int maxVolume = 100;
    private int minVolume = 0;


    public Radio(int number) {
        this.number = number;
        this.maxNumber = number - 1;
    }

    public Radio() {

    }

    public int getNumber() {
        return number;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public int getVolume() {
        return volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setNumber(int newNumber) {
        if (newNumber < minNumber) {
            return;
        }
        if (newNumber > maxNumber) {
            return;
        } else {
            number = newNumber;
        }
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        this.volume = newVolume;
    }

    public void nextNumberRadio() {
        if (number < maxNumber) {
            number = number + 1;
        } else {
            number = minNumber;
        }
    }

    public void prevNumberRadio() {
        if (number > minNumber) {
            number = number - 1;
        } else {
            number = maxNumber;
        }
    }

    public void increaseVolume() {
        if (volume < maxVolume) {
            volume = volume + 1;
        } else {
            volume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (volume > minVolume) {
            volume = volume - 1;
        } else {
            volume = minVolume;
        }
    }


}
