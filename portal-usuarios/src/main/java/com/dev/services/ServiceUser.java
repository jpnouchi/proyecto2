package com.dev.services;

import com.dev.domain.model.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jpnouchi
 * Date: 30/07/14
 * Time: 07:42
 * To change this template use File | Settings | File Templates.
 */
public interface ServiceUser extends GenericService<User>{

    public User getUser(User user);
    public void updateUSer(User user);
    public void deleteUser(User user);
    public void addUser(User user);
    public List<User> findUser(User user);

}
