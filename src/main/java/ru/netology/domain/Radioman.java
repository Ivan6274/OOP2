package ru.netology.domain;

public class Radioman {
    private int minNumbRadiostation;
    private int maxNumbRadiostation;
    private int currentNumbRadiostation;
    private int minVolume;
    private int maxVolume;
    private int currentVolume;

    public int getMinNumbRadiostation() {
        return minNumbRadiostation;
    }

    public void setMinNumbRadiostation(int minNumbRadiostation) {
        this.minNumbRadiostation = minNumbRadiostation;
    }


    public int getMaxNumbRadiostation() {
        return maxNumbRadiostation;
    }

    public void setMaxNumbRadiostation(int maxNumbRadiostation) {
        this.maxNumbRadiostation = maxNumbRadiostation;
    }


    public int getCurrentNumbRadiostation() {
        return currentNumbRadiostation;
    }

    public void setCurrentNumbRadiostation(int currentNumbRadiostation) {
        if (currentNumbRadiostation > maxNumbRadiostation) {
            return;
        }
        if (currentNumbRadiostation < minNumbRadiostation) {
            return;
        }

        this.currentNumbRadiostation = currentNumbRadiostation;
    }


    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }


    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public int nextChannelButton() {
        if (currentNumbRadiostation == maxNumbRadiostation) {
            this.currentNumbRadiostation = minNumbRadiostation;
            return minNumbRadiostation;


        } else
            this.currentNumbRadiostation = currentNumbRadiostation + 1;


        return currentNumbRadiostation;

    }

    public int prevChannelButton() {
        if (currentNumbRadiostation == minNumbRadiostation) {
            this.currentNumbRadiostation = maxNumbRadiostation;
            return maxNumbRadiostation;

        } else
            this.currentNumbRadiostation = currentNumbRadiostation - 1;


        return currentNumbRadiostation;

    }

    public int increaseVolume() {
        if (currentVolume == maxVolume) {
            this.currentVolume = maxVolume;
            return maxVolume;


        } else
            this.currentVolume = currentVolume + 1;


        return currentVolume;

    }

    public int decreaseVolume() {
        if (currentVolume == minVolume) {
            this.currentVolume = minVolume;
            return minVolume;


        } else
            this.currentVolume = currentVolume - 1;


        return currentVolume;

    }


}
