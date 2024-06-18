package edu.cesur.extraordinaria.dao;

import edu.cesur.extraordinaria.model.User;

public interface UserDAO {
    User getUserByUsername(String username);
    void updateUser(User user);
    void addUser(User user);
}
