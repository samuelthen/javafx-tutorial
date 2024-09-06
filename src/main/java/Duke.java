import javafx.application.Application;

/**
 * A launcher class to workaround classpath issues.
 */
public class Duke {
    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }

    /**
     * Generates a response for the user's chat message.
     */
    public String getResponse(String input) {
        return "Duke heard: " + input;
    }
}