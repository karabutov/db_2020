package radio_alarm_clock;

public class RadioImpl implements Radio {

    private double radioWave;
    private boolean isEnabled;

    @Override
    public void setRadioWave(double radioWave) {
        this.radioWave = radioWave;
    }

    @Override
    public void turnRadio() {
        isEnabled = !isEnabled;
    }

}
