package com.dev.services;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Yesmin
 * Date: 22/03/14
 * Time: 11:01 PM
 * To change this template use File | Settings | File Templates.
 */
public interface GenericService <T>{
    public T get(int id);
    public List<T> getAll();
    public void save(T t);
    public void update(T t);
    public void delete(T t);
}
