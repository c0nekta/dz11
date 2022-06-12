package ru.netology.javaqa;

public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int amountStation;
    private int minStation;
    private int currentVolume;
    private int currentStation;

    public Radio() {
    }

    public Radio(int amountStation) {

        this.amountStation = amountStation - 1;
    }


    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > amountStation) {
            this.currentStation = amountStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextStation() {
        if (currentStation == amountStation) {
            this.currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void setPrevStation() {
        if (currentStation == minStation) {
            this.currentStation = amountStation;
            return;
        }
        currentStation--;
    }

    public void inputNumberStation(int numberStation) {
        if (numberStation >= amountStation) {
            numberStation = amountStation;
        }
        if (numberStation <= minStation) {
            numberStation = minStation;
        }
        this.currentStation = numberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
        return;
    }

    public void setUpVolume() {
        if (currentVolume == maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        currentVolume++;
    }


    public void setDownVolume() {
        if (currentVolume == minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        currentVolume--;
    }
}
