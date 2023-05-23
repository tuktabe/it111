import java.io.File;

public class MyFile {

    public static void main(String[] args) {
    //  we are going to create a file object

        File dir = new File("/Users/tukta/Ideaprojects/week7/NewFolder");
    //  create an if else state - if the directory exists, yippy skippy
    //  else, not a good thing

        if(dir.exists()) {
        System.out.println("Yippy Skippy, we have a directory");
        } else {
        System.out.println("We are lost in space, don't know where that directory is?");
        }
    }
}
