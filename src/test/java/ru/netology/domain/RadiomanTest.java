package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadiomanTest {
    @Test
    public void setCurrentNumbRadiostation() {
        Radioman radioman = new Radioman();
        assertEquals(0, radioman.getMinNumbRadiostation());
        radioman.setMinNumbRadiostation(0);
        assertEquals(0, radioman.getMinNumbRadiostation());

        assertEquals(0, radioman.getMaxNumbRadiostation());
        radioman.setMaxNumbRadiostation(9);
        assertEquals(9, radioman.getMaxNumbRadiostation());

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
        Radioman radioman = new Radioman();
        assertEquals(0, radioman.getMinVolume());
        radioman.setMinVolume(0);
        assertEquals(0, radioman.getMinVolume());

        assertEquals(0, radioman.getMaxVolume());
        radioman.setMaxVolume(10);
        assertEquals(10, radioman.getMaxVolume());

        assertEquals(0, radioman.getCurrentVolume());
        radioman.setCurrentVolume(-14);
        assertEquals(0, radioman.getCurrentVolume());

        assertEquals(0, radioman.getCurrentVolume());
        radioman.setCurrentVolume(14);
        assertEquals(0, radioman.getCurrentVolume());

        assertEquals(0, radioman.getCurrentVolume());
        radioman.setCurrentVolume(5);
        assertEquals(5, radioman.getCurrentVolume());
    }

    @Test
    public void nextChannelButton() {
        Radioman radioman = new Radioman();
        assertEquals(0, radioman.getMinNumbRadiostation());
        radioman.setMinNumbRadiostation(0);
        assertEquals(0, radioman.getMinNumbRadiostation());

        assertEquals(0, radioman.getMaxNumbRadiostation());
        radioman.setMaxNumbRadiostation(9);
        assertEquals(9, radioman.getMaxNumbRadiostation());

        assertEquals(0, radioman.getCurrentNumbRadiostation());
        radioman.setCurrentNumbRadiostation(4);
        assertEquals(4, radioman.getCurrentNumbRadiostation());

        assertEquals(5, radioman.nextChannelButton());
        assertEquals(6, radioman.nextChannelButton());
        assertEquals(7, radioman.nextChannelButton());
        assertEquals(8, radioman.nextChannelButton());
        assertEquals(9, radioman.nextChannelButton());
        assertEquals(0, radioman.nextChannelButton());
    }

    @Test
    public void prevChannelButton() {
        Radioman radioman = new Radioman();
        assertEquals(0, radioman.getMinNumbRadiostation());
        radioman.setMinNumbRadiostation(0);
        assertEquals(0, radioman.getMinNumbRadiostation());

        assertEquals(0, radioman.getMaxNumbRadiostation());
        radioman.setMaxNumbRadiostation(9);
        assertEquals(9, radioman.getMaxNumbRadiostation());

        assertEquals(0, radioman.getCurrentNumbRadiostation());
        radioman.setCurrentNumbRadiostation(4);
        assertEquals(4, radioman.getCurrentNumbRadiostation());

        assertEquals(3, radioman.prevChannelButton());
        assertEquals(2, radioman.prevChannelButton());
        assertEquals(1, radioman.prevChannelButton());
        assertEquals(0, radioman.prevChannelButton());
        assertEquals(9, radioman.prevChannelButton());
        assertEquals(8, radioman.prevChannelButton());
    }

    @Test
    public void increaseVolume() {
        Radioman radioman = new Radioman();
        assertEquals(0, radioman.getMinVolume());
        radioman.setMinVolume(0);
        assertEquals(0, radioman.getMinVolume());

        assertEquals(0, radioman.getMaxVolume());
        radioman.setMaxVolume(10);
        assertEquals(10, radioman.getMaxVolume());

        assertEquals(0, radioman.getCurrentVolume());
        radioman.setCurrentVolume(5);
        assertEquals(5, radioman.getCurrentVolume());

        assertEquals(6, radioman.increaseVolume());
        assertEquals(7, radioman.increaseVolume());
        assertEquals(8, radioman.increaseVolume());
        assertEquals(9, radioman.increaseVolume());
        assertEquals(10, radioman.increaseVolume());
        assertEquals(10, radioman.increaseVolume());


    }
    @Test
    public void decreaseVolume() {
        Radioman radioman = new Radioman();
        assertEquals(0, radioman.getMinVolume());
        radioman.setMinVolume(0);
        assertEquals(0, radioman.getMinVolume());

        assertEquals(0, radioman.getMaxVolume());
        radioman.setMaxVolume(10);
        assertEquals(10, radioman.getMaxVolume());

        assertEquals(0, radioman.getCurrentVolume());
        radioman.setCurrentVolume(5);
        assertEquals(5, radioman.getCurrentVolume());

        assertEquals(4, radioman.decreaseVolume());
        assertEquals(3, radioman.decreaseVolume());
        assertEquals(2, radioman.decreaseVolume());
        assertEquals(1, radioman.decreaseVolume());
        assertEquals(0, radioman.decreaseVolume());
        assertEquals(0, radioman.decreaseVolume());


    }
}
