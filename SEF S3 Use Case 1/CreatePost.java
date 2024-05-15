public class CreatePost {
    public static void main(String[] args) {
        // Creating a sample Registered User
        RegisteredUser user = new RegisteredUser("user123", "pass123");

        // Creating UserInteraction instance
        UserInteraction interaction = new UserInteraction(user);

        // Perform login
        interaction.performLogin();

        // Create a post
        interaction.createPost();

        // Perform logout
        interaction.performLogout();
    }
}

    

