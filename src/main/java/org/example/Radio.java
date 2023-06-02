package org.example;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int minStation;

    public Radio() {
        maxStation = 9;
        minStation = 0;
    }

    public void next() {
       if (currentStation != maxStation) {
           currentStation++;
       } else {
           currentStation = 0;
       }
    }

    public void prev() {
        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }


}
