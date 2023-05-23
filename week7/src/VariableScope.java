public class VariableScope {

    public static void main(String[] args) {
    // we are inside a MAIN method
    String txt = "This is the local variable in the main method!";
    System.out.println(txt);
    // in order for the sub method to run, we need to call the method in the main method
    sub();
    }

    public static void sub() {
    String txt = "This is the local variable in the sub method!";
    System.out.println(txt);
    }
}
