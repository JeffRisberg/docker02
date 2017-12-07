package com.incra.services;

import com.incra.models.User;

import java.util.List;

/**
 * @author Jeff Risberg
 * @since 11/20/17
 */
public interface UserService {

    public User getOne(Long Id);

    public List<User> getList(int limit, int offset);

}
