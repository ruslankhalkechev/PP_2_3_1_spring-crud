package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    void add(User user);

    void deleteUserById(long id);

    void update(User user);

    User getUserById(long id);

    List<User> getListOfUsers();
}
