public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentStation = minStation;
    private int currentVolume = 30;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int numberOfStations) {
        if (numberOfStations > 0) {
            this.maxStation = numberOfStations - 1;
        }
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
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

    public void setStation(int station) {
        if (station >= minStation && station <= maxStation) {
            currentStation = station;
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

    public void setVolume(int vol) {
        if (vol >= minVolume && vol <= maxVolume) {
            currentVolume = vol;
        }
    }
}