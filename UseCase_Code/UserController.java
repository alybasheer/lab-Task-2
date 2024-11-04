public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public String handleCreateProfile(String name, String email, String password) {
        // Input validation could be enhanced further as needed
        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            return "Please fill in all required fields.";
        }

        return userService.createUserProfile(name, email, password);
    }
}
