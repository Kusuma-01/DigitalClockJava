import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

public class DigitalClock extends JFrame {
    private JLabel timeLabel;
    private JLabel dateLabel;
    private Alarm alarm;

    public DigitalClock() {
        setTitle("⏰Advanced Digital Clock⏰");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 1));

        timeLabel = new JLabel("", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Verdana", Font.BOLD, 40));
        add(timeLabel);

        dateLabel = new JLabel("", SwingConstants.CENTER);
        dateLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
        add(dateLabel);

        alarm = new Alarm();

        Timer timer = new Timer(1000, e -> updateClock());
        timer.start();

        setVisible(true);
    }

    private void updateClock() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd MMM yyyy");
        timeLabel.setText(timeFormat.format(new Date()));
        dateLabel.setText(dateFormat.format(new Date()));

        alarm.checkAlarm();
    }

    public static void main(String[] args) {
        new DigitalClock();
    }
}
