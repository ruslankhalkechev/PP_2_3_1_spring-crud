package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    User add(User user);

    void deleteUserById(long id);

    User update(User user, long id);

    User getUserById(long id);

    List<User> getListOfUsers();

}
