// UI Layer: UserController.java
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public String handleCreateProfile(String name, String email, String password) {
        // Basic input validation
        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            return "Please fill in all required fields.";
        }
        
        return userService.createUserProfile(name, email, password);
    }
}
