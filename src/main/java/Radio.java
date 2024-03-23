public class Radio {
    private int quantityStation = 10;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentStation;
    private int currentVolume;

    public Radio (int quantityStation, int maxStation, int minStation, int maxVolume, int minVolume) {
        this.quantityStation = quantityStation;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;


    }

    public Radio () {
        quantityStation = getQuantityStation();
    }



    public int getCurrentStation() {
        return currentStation;
    }

    public int getQuantityStation() { return quantityStation; }

    public int getMaxStation() { return maxStation; }

    public int getMinStation() { return minStation; }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() { return maxVolume; }

    public int getMinVolume() { return minVolume; }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setNextStationAfterMax() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
    }

    public void setPrevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    public void setIncreaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void setDecreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }

}

















