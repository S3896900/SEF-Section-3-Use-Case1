import java.util.Scanner;

// Class representing a Registered User
public class RegisteredUser {
    private String username;
    private String password;
    private boolean isLoggedIn;
    private Scanner scanner;

    // Constructor
    public RegisteredUser(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLoggedIn = false;
        this.scanner = new Scanner(System.in);
    }

    // Method to login
    public void login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("Welcome, " + username + "! You are now logged in.");
            isLoggedIn = true;
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    // Method to logout
    public void logout() {
        System.out.println("Goodbye, " + username + "! You are now logged out.");
        isLoggedIn = false;
    }

    // Method to get username
    public String getUsername() {
        return username;
    }

    // Method to get password
    public String getPassword() {
        return password;
    }

    // Method to check if the user is logged in
    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    // Method to create a post
    public void createPost(String title, String content) {
        if (!isLoggedIn) {
            System.out.println("Please log in to create a post.");
            return;
        }
        Post post = new Post(title, content);
        System.out.println("Post created successfully.");
    }
}

// Class representing a Post
class Post {
    private String title;
    private String content;

    // Constructor
    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for content
    public String getContent() {
        return content;
    }
}
