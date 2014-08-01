package com.dev.services.impl;

import com.dev.domain.mapper.UsuarioMapper;
import com.dev.domain.model.User;
import com.dev.services.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jpnouchi
 * Date: 30/07/14
 * Time: 07:43
 * To change this template use File | Settings | File Templates.
 */
@Service
public class ServiceUserImpl implements ServiceUser{

    @Autowired
    private UsuarioMapper usuarioMapper;

    @Override
    public User getUser(User user) {
        return usuarioMapper.getUser(user);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updateUSer(User user) {
        //To change body of implemented methods use File | Settings | File Templates.
        usuarioMapper.updateUser(user);
    }

    @Override
    public void deleteUser(User user) {
        //To change body of implemented methods use File | Settings | File Templates.
        usuarioMapper.deleteUser(user);
    }

    @Override
    public void addUser(User user) {
        //To change body of implemented methods use File | Settings | File Templates.
        usuarioMapper.addUser(user);
    }

    @Override
    public List<User> findUser(User user) {
        return usuarioMapper.findUser(user);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public User get(int id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<User> getAll() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void save(User user) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void update(User user) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(User user) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
