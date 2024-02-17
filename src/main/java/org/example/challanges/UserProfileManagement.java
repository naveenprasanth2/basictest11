package org.example.challanges;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

public class UserProfileManagement {

    private static final Map<String, User> database = new HashMap<>();

    static {
        // Simulating user data
        database.put("1", new User(Optional.of("user1@example.com"), Optional.of("user1nick")));
        database.put("2", new User(Optional.of("user2@example.com"), Optional.empty()));
        database.put("3", new User(Optional.empty(), Optional.of("user3nick")));
        database.put("4", new User(Optional.empty(), Optional.empty()));
    }

    public static void main(String[] args) {
        String userId = "1"; // Try with different user IDs to test
        greetUser(userId);
    }

    private static Optional<String> getEmail(String userId) {
        // Your implementation here
        return database.get(userId).email;
    }

    private static Optional<String> getNickname(String userId) {
        return database.get(userId).nickname;
    }

    private static void greetUser(String userId) {
        if (database.get(userId) != null) {
            String value = "";
            if (database.get(userId).nickname.isPresent())
                value = database.get(userId).nickname.orElseThrow(() -> new NoSuchElementException("No nick name found"));
            else if (database.get(userId).email.isPresent())
                value = database.get(userId).email.orElseThrow(() -> new NoSuchElementException("No nick name found"));
            System.out.println(STR."Hi \{value}");
        } else {
            throw new NoSuchElementException("No user found");
        }
    }

    // Assuming User class looks like this
    record User(Optional<String> email, Optional<String> nickname) {

    }
}
