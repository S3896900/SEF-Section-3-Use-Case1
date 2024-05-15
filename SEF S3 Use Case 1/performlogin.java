import java.util.Scanner;

// Class to handle user login
public class performlogin {
    private RegisteredUser user;

    // Constructor
    public performlogin(RegisteredUser user) {
        this.user = user;
    }

    // Method to perform login
    public void performLogin() {
        Scanner inputScanner = new Scanner(System.in);
        boolean loginSuccessful = false;
        
        while (!loginSuccessful) {
            System.out.println("Please enter your username:");
            String usernameInput = inputScanner.nextLine();
            System.out.println("Please enter your password:");
            String passwordInput = inputScanner.nextLine();

            // Attempting to login with the provided username and password
            user.login(usernameInput, passwordInput);

            // If login is successful, set loginSuccessful to true
            if (user.isLoggedIn()) {
                System.out.println("You are now logged in.");
                loginSuccessful = true;
            } else {
                System.out.println("Login failed. Do you want to try again? (yes/no)");
                String tryAgain = inputScanner.nextLine();
                if (!tryAgain.equalsIgnoreCase("yes")) {
                    break; // Exit loop if the user doesn't want to try again
                }
            }
        }
    }
}
