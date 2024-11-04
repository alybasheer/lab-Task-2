import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        UserService userService = new UserService(userDAO);
        UserController userController = new UserController(userService);

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Create Profile ===");
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        
        String result = userController.handleCreateProfile(name, email, password);
        System.out.println(result);
        
        scanner.close();
    }
}
