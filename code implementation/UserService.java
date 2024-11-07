// Application Layer: UserService.java
public class UserService {
    private UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public String createUserProfile(String name, String email, String password) {
        if (userDAO.findByEmail(email) != null) {
            return "Email already in use!";
        }

        User user = new User(name, email, password);
        boolean isSaved = userDAO.save(user);

        return isSaved ? "Account created successfully!" : "Error in creating account.";
    }
}
