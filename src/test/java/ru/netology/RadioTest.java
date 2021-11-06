package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void ShouldIncreaseVolumeTillMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void ShouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.decreaseVolume();
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    public void ShouldDecreaseVolumeTillMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void ShouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void ShouldSetNextChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        radio.nextChannel();
        assertEquals(6, radio.getCurrentChannel());
    }

    @Test
    public void ShouldSetPreviousChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        radio.previousChannel();
        assertEquals(4, radio.getCurrentChannel());
    }

    @Test
    public void ShouldSetPreviousChannelBeforeZero() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.previousChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void ShouldSetNextChannelFrom9() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.nextChannel();
        assertEquals(0, radio.getCurrentChannel());
    }
    @Test
    public void ShouldNotSetChannelBelowZero() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);
        assertEquals(0, radio.getCurrentChannel());
    }
    @Test
    public void ShouldNotSetChannelAbove9() {
        Radio radio = new Radio();
        radio.setCurrentChannel(10);
        assertEquals(0, radio.getCurrentChannel());
    }
    @Test
    public void ShouldNotSetVolumeAbove10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void ShouldNotSetVolumeBelowZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }
}