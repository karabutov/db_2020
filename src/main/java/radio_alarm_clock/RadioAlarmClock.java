package radio_alarm_clock;

public class RadioAlarmClock {

    private Radio radio = new RadioImpl();
    private AlarmClock alarmClock = new AlarmClockImpl();

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
