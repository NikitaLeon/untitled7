public class Radio {
    public int currentStation;

    public void minStation() {
        currentStation = 0;
    }

    public void maxStation() {
        currentStation = 9;
    }

    public void nextStationAfterMax(int newCurrentStation) {
        if (newCurrentStation < 9) {
            newCurrentStation = newCurrentStation + 1;
        } else {
            newCurrentStation = 0;
        }
        currentStation = newCurrentStation;

    }

    public void prevStation(int newCurrentStation) {
        if (newCurrentStation > 0) {
            newCurrentStation = newCurrentStation - 1;
        } else {
            newCurrentStation = 9;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public int currentVolume;

    public void minVolume() {
        currentVolume = 0;
    }

    public void maxVolume() {
        currentVolume = 100;
    }

    public void increaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 100) {
            newCurrentVolume = newCurrentVolume + 1;
        } else {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

    public void decreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume > 0) {
            newCurrentVolume = newCurrentVolume - 1;
        } else {
            newCurrentVolume = 0;
        }
        currentVolume = newCurrentVolume;
    }
}






