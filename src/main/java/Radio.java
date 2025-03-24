public class Radio {
    private int currentStation = 0;
    private int currentVolume = 0;

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public void setStation(int station) {
        if (station >= 0 && station <= 9) {
            currentStation = station;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setVolume(int vol) {
        if (vol >= 0 && vol <= 100) {
            currentVolume = vol;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}