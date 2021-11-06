package ru.netology;

public class Radio {
    private int currentVolume;
    private int currentChannel;

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume ++;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume --;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getCurrentChannel() {
        return currentChannel;
    }

    public void nextChannel() {
        if (currentChannel < 9) {
           currentChannel ++;
           return;
        }
        currentChannel = 0;
    }

    public void previousChannel() {
        if (currentChannel > 0) {
            currentChannel --;
            return;
        }
        currentChannel = 9;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > 9) {
            return;
        }
        if (currentChannel< 0) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume< 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
