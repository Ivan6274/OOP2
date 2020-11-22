package ru.netology.domain;

import lombok.Data;

@Data

public class Radioman {
    private int id;
    private String name = "name";
    private int minNumbRadiostation = 0;
    private int maxNumbRadiostation = 10;
    private int currentNumbRadiostation = 0;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = 0;
    private boolean on;



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
