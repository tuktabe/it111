import javax.swing.*;

public class KiloConverter extends JFrame {

    JPanel panel;

    JLabel messageLabel;

    JTextField kiloTextField;

    JButton calcButton;

    final int WINDOW_WIDTH = 350;

    final int WINDOW_HEIGHT = 450;

    // always be aware of the color that IntelliJ is using

    // create a constructor which is a special method to initialize

    public KiloConverter() {
        setTitle("Kilometer Converter");

        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();

        add(panel);

        setVisible(true);

    }

    public void buildPanel() {
        messageLabel = new JLabel("Enter a distance in Kilometers");
        // text, button, panel

        kiloTextField = new JTextField(10);

        calcButton = new JButton("Calculate");

        panel = new JPanel();

        //we now have to add the above three components onto the JPanel

        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(calcButton);
    }

    // we have to add our main method!!!

    public static void main(String[] args) {
        new KiloConverter();
    }

}
