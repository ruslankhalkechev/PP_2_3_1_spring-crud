package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    void deleteUserById(long id);

    void update(User user, long id);

    User getUserById(long id);

    List<User> getListOfUsers();

}
