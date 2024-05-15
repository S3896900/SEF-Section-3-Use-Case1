import java.util.Scanner;

// Class to handle user interaction
public class UserInteraction {
    private RegisteredUser user;

    // Constructor
    public UserInteraction(RegisteredUser user) {
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

    // Method to create a post
public void createPost() {
    if (user.isLoggedIn()) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Since you are logged in, you can create a post.");
        while (true) {
            System.out.println("Please enter the title of your post:");
            String title = inputScanner.nextLine();
            System.out.println("Please enter the content of your post:");
            String content = inputScanner.nextLine();
            user.createPost(title, content);

            // Ask if the user wants to create another post
            System.out.println("Do you want to create another post? (yes/no)");
            String createAnotherPost = inputScanner.nextLine();
            if (!createAnotherPost.equalsIgnoreCase("yes")) {
                break; // Exit loop if the user doesn't want to create another post
            }
        }
    } else {
        System.out.println("Please log in first.");
    }
}

    // Method to perform logout
    public void performLogout() {
        user.logout();
    }
        // Method to check if the user wants to logout
        public boolean wantsToLogout(String input) {
            return input.equalsIgnoreCase("logout");
        }
}
