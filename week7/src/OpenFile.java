import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class OpenFile {

    public static void main(String[] args) {

    File file;
    Scanner inputFile;
    String fileName;

    fileName = JOptionPane.showInputDialog("Enter " + "the name of the file");
    // attempt to open the file

    try {
    file = new File(fileName);
    inputFile = new Scanner(file);
    JOptionPane.showMessageDialog(null, "The file was found, yippy skippy, displayed in TRY");


    } catch (Exception e) {
    JOptionPane.showMessageDialog(null, "The file was NOT FOUND - This is in CATCH");

    }

    JOptionPane.showMessageDialog(null, "Program has finished running - done - displayed after the catch");

    }
}
