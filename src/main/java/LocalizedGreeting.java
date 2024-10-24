import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LocalizedGreeting {

    public static void main(String[] args) {
        // Prompt user to select a language
        System.out.println("Select a language: ");
        System.out.println("1. English");
        System.out.println("2. French");
        System.out.println("3. Spanish");
        System.out.println("4. Japan");
        System.out.println("5. Persian");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // Set the locale based on user's choice
        Locale locale;
        switch (choice) {
            case 1:
                locale = new Locale("en", "UK");
                break;
            case 2:
                locale = new Locale("fr", "FR");
                break;
            case 3:
                locale = new Locale("es", "ES");
                break;



            case 4:
                locale = new Locale("ja", "JP");
                break;

            case 5:
                locale = new Locale("fa", "FR");
                break;

            default:
                System.out.println("Invalid choice. Defaulting to English.");
                locale = new Locale("en", "US");
                break;


        }


        // Load the resource bundle for the selected locale
        ResourceBundle messages = ResourceBundle.getBundle("Message", locale);

        // Display the localized greeting message
        System.out.println(messages.getString("greeting"));

        scanner.close();
    }
}


