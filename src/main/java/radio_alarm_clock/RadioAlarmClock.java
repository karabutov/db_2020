package radio_alarm_clock;

public class RadioAlarmClock {

    private Radio radio;

    private AlarmClock alarmClock;

    public RadioAlarmClock(Radio radio, AlarmClock alarmClock) {
        this.radio = radio;
        this.alarmClock = alarmClock;
    }


    public void turnOfAlarm() {
        alarmClock.turnOfAlarm();
    }

    public void setAlarmTime(String alarmTime) {
        alarmClock.setAlarmTime(alarmTime);
    }

    public void setRadioWave(double radioWave) {
        radio.setRadioWave(radioWave);
    }

    public void turnRadio() {
        radio.turnRadio();
    }

}
