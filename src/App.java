public class App {
    public static final String ANSI_GREEN = "\u001B[32m"; // Example color code
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) throws Exception {
        System.out.println(ANSI_GREEN + "This text is colored" + ANSI_RESET + " and this text is not.");
    }
}
