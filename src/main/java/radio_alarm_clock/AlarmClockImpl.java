package radio_alarm_clock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AlarmClockImpl implements AlarmClock {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

    private LocalDateTime alarmTime;


    @Override
    public void turnOfAlarm() {
        alarmTime = null;
    }

    @Override
    public void setAlarmTime(String alarmTime) {
        this.alarmTime = LocalDateTime.parse(alarmTime, formatter);
    }
}
