public class App {
    public static final String ANSI_CYAN = "\u001B[36m"; // Example color code
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) throws Exception {
        System.out.println(ANSI_CYAN + "This text is colored" + ANSI_RESET);
    }
}
