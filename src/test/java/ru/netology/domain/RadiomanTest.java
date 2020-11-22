package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadiomanTest {
    Radioman radioman = new Radioman();
    @Test

    public void setCurrentNumbRadiostation() {

        assertEquals(0, radioman.getMinNumbRadiostation());
        radioman.setMinNumbRadiostation(0);
        assertEquals(0, radioman.getMinNumbRadiostation());

        assertEquals(0, radioman.getMaxNumbRadiostation());
        radioman.setMaxNumbRadiostation(10);
        assertEquals(10, radioman.getMaxNumbRadiostation());

        assertEquals(0, radioman.getCurrentNumbRadiostation());
        radioman.setCurrentNumbRadiostation(-14);
        assertEquals(0, radioman.getCurrentNumbRadiostation());

        assertEquals(0, radioman.getCurrentNumbRadiostation());
        radioman.setCurrentNumbRadiostation(14);
        assertEquals(0, radioman.getCurrentNumbRadiostation());

        assertEquals(0, radioman.getCurrentNumbRadiostation());
        radioman.setCurrentNumbRadiostation(4);
        assertEquals(4, radioman.getCurrentNumbRadiostation());
    }

    @Test
    public void setCurrentVolume() {

        assertEquals(0, radioman.getMinVolume());
        radioman.setMinVolume(0);
        assertEquals(0, radioman.getMinVolume());

        assertEquals(0, radioman.getMaxVolume());
        radioman.setMaxVolume(100);
        assertEquals(100, radioman.getMaxVolume());

        assertEquals(0, radioman.getCurrentVolume());
        radioman.setCurrentVolume(-14);
        assertEquals(0, radioman.getCurrentVolume());

        assertEquals(0, radioman.getCurrentVolume());
        radioman.setCurrentVolume(144);
        assertEquals(0, radioman.getCurrentVolume());

        assertEquals(0, radioman.getCurrentVolume());
        radioman.setCurrentVolume(50);
        assertEquals(50, radioman.getCurrentVolume());
    }

    @Test
    public void nextChannelButton() {

        assertEquals(0, radioman.getMinNumbRadiostation());
        radioman.setMinNumbRadiostation(0);
        assertEquals(0, radioman.getMinNumbRadiostation());

        assertEquals(0, radioman.getMaxNumbRadiostation());
        radioman.setMaxNumbRadiostation(10);
        assertEquals(10, radioman.getMaxNumbRadiostation());

        assertEquals(0, radioman.getCurrentNumbRadiostation());
        radioman.setCurrentNumbRadiostation(4);
        assertEquals(4, radioman.getCurrentNumbRadiostation());

        assertEquals(5, radioman.nextChannelButton());
        assertEquals(6, radioman.nextChannelButton());
        assertEquals(7, radioman.nextChannelButton());

    }

    @Test
    public void nextChannelButtonUnderMax() {

        assertEquals(0, radioman.getMinNumbRadiostation());
        radioman.setMinNumbRadiostation(0);
        assertEquals(0, radioman.getMinNumbRadiostation());

        assertEquals(0, radioman.getMaxNumbRadiostation());
        radioman.setMaxNumbRadiostation(10);
        assertEquals(10, radioman.getMaxNumbRadiostation());

        assertEquals(0, radioman.getCurrentNumbRadiostation());
        radioman.setCurrentNumbRadiostation(9);
        assertEquals(9, radioman.getCurrentNumbRadiostation());

        assertEquals(10, radioman.nextChannelButton());
        assertEquals(0, radioman.nextChannelButton());
        assertEquals(1, radioman.nextChannelButton());

    }

    @Test
    public void prevChannelButton() {

        assertEquals(0, radioman.getMinNumbRadiostation());
        radioman.setMinNumbRadiostation(0);
        assertEquals(0, radioman.getMinNumbRadiostation());

        assertEquals(0, radioman.getMaxNumbRadiostation());
        radioman.setMaxNumbRadiostation(10);
        assertEquals(10, radioman.getMaxNumbRadiostation());

        assertEquals(0, radioman.getCurrentNumbRadiostation());
        radioman.setCurrentNumbRadiostation(4);
        assertEquals(4, radioman.getCurrentNumbRadiostation());

        assertEquals(3, radioman.prevChannelButton());
        assertEquals(2, radioman.prevChannelButton());
        assertEquals(1, radioman.prevChannelButton());

    }

    @Test
    public void prevChannelButtonUnderMin() {

        assertEquals(0, radioman.getMinNumbRadiostation());
        radioman.setMinNumbRadiostation(0);
        assertEquals(0, radioman.getMinNumbRadiostation());

        assertEquals(0, radioman.getMaxNumbRadiostation());
        radioman.setMaxNumbRadiostation(10);
        assertEquals(10, radioman.getMaxNumbRadiostation());

        assertEquals(0, radioman.getCurrentNumbRadiostation());
        radioman.setCurrentNumbRadiostation(1);
        assertEquals(1, radioman.getCurrentNumbRadiostation());

        assertEquals(0, radioman.prevChannelButton());
        assertEquals(10, radioman.prevChannelButton());
        assertEquals(9, radioman.prevChannelButton());

    }

    @Test
    public void increaseVolume() {

        assertEquals(0, radioman.getMinVolume());
        radioman.setMinVolume(0);
        assertEquals(0, radioman.getMinVolume());

        assertEquals(0, radioman.getMaxVolume());
        radioman.setMaxVolume(100);
        assertEquals(100, radioman.getMaxVolume());

        assertEquals(0, radioman.getCurrentVolume());
        radioman.setCurrentVolume(50);
        assertEquals(50, radioman.getCurrentVolume());

        assertEquals(51, radioman.increaseVolume());
        assertEquals(52, radioman.increaseVolume());
        assertEquals(53, radioman.increaseVolume());


    }

    @Test
    public void increaseVolumeMaxLimit() {

        assertEquals(0, radioman.getMinVolume());
        radioman.setMinVolume(0);
        assertEquals(0, radioman.getMinVolume());

        assertEquals(0, radioman.getMaxVolume());
        radioman.setMaxVolume(100);
        assertEquals(100, radioman.getMaxVolume());

        assertEquals(0, radioman.getCurrentVolume());
        radioman.setCurrentVolume(98);
        assertEquals(98, radioman.getCurrentVolume());

        assertEquals(99, radioman.increaseVolume());
        assertEquals(100, radioman.increaseVolume());
        assertEquals(100, radioman.increaseVolume());
    }

    @Test
    public void decreaseVolume() {

        assertEquals(0, radioman.getMinVolume());
        radioman.setMinVolume(0);
        assertEquals(0, radioman.getMinVolume());

        assertEquals(0, radioman.getMaxVolume());
        radioman.setMaxVolume(100);
        assertEquals(100, radioman.getMaxVolume());

        assertEquals(0, radioman.getCurrentVolume());
        radioman.setCurrentVolume(5);
        assertEquals(5, radioman.getCurrentVolume());

        assertEquals(4, radioman.decreaseVolume());
        assertEquals(3, radioman.decreaseVolume());
        assertEquals(2, radioman.decreaseVolume());


    }
    @Test
    public void decreaseVolumeMinLimit() {

        assertEquals(0, radioman.getMinVolume());
        radioman.setMinVolume(0);
        assertEquals(0, radioman.getMinVolume());

        assertEquals(0, radioman.getMaxVolume());
        radioman.setMaxVolume(100);
        assertEquals(100, radioman.getMaxVolume());

        assertEquals(0, radioman.getCurrentVolume());
        radioman.setCurrentVolume(2);
        assertEquals(2, radioman.getCurrentVolume());

        assertEquals(1, radioman.decreaseVolume());
        assertEquals(0, radioman.decreaseVolume());
        assertEquals(0, radioman.decreaseVolume());


    }
}
