import java.util.Scanner;

public class LoginProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctUsername = "user123";
        String correctPassword = "password123";
        int maxTries = 3;
        int tries = 0;

        while (tries < maxTries) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Login failed. Please try again.");
                tries++;
                if (tries < maxTries) {
                    System.out.println("You have " + (maxTries - tries) + " tries left.");
                }
            }
        }

        if (tries >= maxTries) {
            System.out.println("Maximum login attempts reached. Account locked.");
        }

        scanner.close();
    }
}
