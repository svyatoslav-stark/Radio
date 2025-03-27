public class Radio {
    private int minStation = 1;
    private int maxStation = 10;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentStation = minStation;
    private int currentVolume = 30;

    public Radio(int maxStation, int minStation) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setStation(int station) {
        if (station <= maxStation && station >= minStation) {
            currentStation = station;
        }
    }

    public void setVolume(int volume) {
        if (volume <= maxVolume && volume >= minVolume) {
            currentVolume = volume;
        }
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}