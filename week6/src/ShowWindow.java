import javax.swing. *;

public class ShowWindow {

    public static void main(String[] args) {
        // declare our variables
        // we are going to make them CONSTANTS

        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 250;

        // Create a window

        JFrame window = new JFrame();
        // set the title
        window.setTitle("My Simple Window");

        // setting the size of our window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // close the window and exit the program

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // display the window - if we do not display the window, it will not display!
        // displaying the window is a boolean

        window.setVisible(true);



    }


}
