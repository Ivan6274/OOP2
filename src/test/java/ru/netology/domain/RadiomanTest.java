package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadiomanTest {

    @Test

    public void setCurrentNumbRadiostation() {
        Radioman radioman = new Radioman(1, "NewRadio", 2, 2, true);

        radioman.setCurrentNumbRadiostation(-14);
        assertEquals(2, radioman.getCurrentNumbRadiostation());

        radioman.setCurrentNumbRadiostation(14);
        assertEquals(2, radioman.getCurrentNumbRadiostation());
        ;
        radioman.setCurrentNumbRadiostation(4);
        assertEquals(4, radioman.getCurrentNumbRadiostation());
    }


    @Test
    public void nextChannelButton() {
        Radioman radioman = new Radioman(1, "NewRadio", 2, 2, true);
        assertEquals(3, radioman.nextChannelButton());
        assertEquals(4, radioman.nextChannelButton());
        assertEquals(5, radioman.nextChannelButton());

    }


    @Test
    public void prevChannelButton() {
        Radioman radioman = new Radioman(1, "NewRadio", 5, 2, true);
        assertEquals(4, radioman.prevChannelButton());
        assertEquals(3, radioman.prevChannelButton());
        assertEquals(2, radioman.prevChannelButton());


    }

    @Test
    public void nextChannelButtonUnderMax() {
        Radioman radioman = new Radioman(1, "NewRadio", 9, 2, true);
        assertEquals(10, radioman.nextChannelButton());
        assertEquals(0, radioman.nextChannelButton());
        assertEquals(1, radioman.nextChannelButton());

    }

    @Test
    public void prevChannelButtonUnderMin() {
        Radioman radioman = new Radioman(1, "NewRadio", 2, 2, true);
        assertEquals(1, radioman.prevChannelButton());
        assertEquals(0, radioman.prevChannelButton());
        assertEquals(10, radioman.prevChannelButton());

    }

    @Test
    public void increaseVolume() {
        Radioman radioman = new Radioman(1, "NewRadio", 2, 22, true);
        assertEquals(23, radioman.increaseVolume());
        assertEquals(24, radioman.increaseVolume());
        assertEquals(25, radioman.increaseVolume());


    }


    @Test
    public void decreaseVolume() {
        Radioman radioman = new Radioman(1, "NewRadio", 2, 45, true);
        assertEquals(44, radioman.decreaseVolume());
        assertEquals(43, radioman.decreaseVolume());
        assertEquals(42, radioman.decreaseVolume());


    }

    @Test
    public void decreaseVolumeMinLimit() {
        Radioman radioman = new Radioman(1, "NewRadio", 2, 2, true);
        assertEquals(1, radioman.decreaseVolume());
        assertEquals(0, radioman.decreaseVolume());
        assertEquals(0, radioman.decreaseVolume());

    }


    @Test
    public void increaseVolumeMaxLimit() {
        Radioman radioman = new Radioman(1, "NewRadio", 2, 98, true);
        assertEquals(99, radioman.increaseVolume());
        assertEquals(100, radioman.increaseVolume());
        assertEquals(100, radioman.increaseVolume());
    }
}
