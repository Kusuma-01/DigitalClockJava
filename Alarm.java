import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Alarm {
    private String alarmTime = "07:00:00 AM";
  // Default alarm time

    public void setAlarm(String time) {
        this.alarmTime = time;
        JOptionPane.showMessageDialog(null, "Alarm set for " + time);
    }

    public void checkAlarm() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
        String currentTime = sdf.format(new Date());
        if (currentTime.equals(alarmTime)) {
            JOptionPane.showMessageDialog(null, "ALARM! Time: " + currentTime);
        }
    }
}
