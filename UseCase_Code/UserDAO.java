import java.util.HashMap;
import java.util.Map;

public class UserDAO {
    private Map<String, User> usersDatabase = new HashMap<>();

    public boolean save(User user) {
        if (usersDatabase.containsKey(user.getEmail())) {
            return false; // Email already exists
        }
        usersDatabase.put(user.getEmail(), user);
        return true;
    }

    public User findByEmail(String email) {
        return usersDatabase.get(email);
    }
}

