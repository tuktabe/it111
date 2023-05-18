import javax.swing.*;
import java.awt.*;

public class ShowPanel {
        JLabel myLabel, myLabel2;
        JTextField windowTextField, windowTextField2;
        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 400;

    public ShowPanel() {
        JFrame window = new JFrame();
        window.setTitle("My Simple Window");
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.getContentPane().setBackground(Color.red);
        window.setLocationRelativeTo(null);
        buildLabels();
        addWindowLabels(window);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }
    public void addWindowLabels(JFrame window){
        window.setLayout(null);
        window.add(myLabel);
        window.add(myLabel2);
        window.add(windowTextField);
        window.add(windowTextField2);
    }

    public void buildLabels() {

        myLabel = new JLabel("My First Big Label!!!");
        myLabel.setBounds(20,30,200,30);
        myLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        windowTextField = new JTextField(10);
        windowTextField.setBounds(20,60,200,30);

        myLabel2 = new JLabel("My Second Big Label!");
        myLabel2.setBounds(20, 100, 200, 30);
        myLabel2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));

        windowTextField2 = new JTextField(10);
        windowTextField2.setBounds(20,130,200,30);

    }
    public static void main(String[] args) {
        new ShowPanel();
    }

}
