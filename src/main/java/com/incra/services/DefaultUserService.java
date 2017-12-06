package com.incra.services;

import com.incra.models.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jeff Risberg
 * @since 11/20/17
 */
public class DefaultUserService implements UserService {

    public List<User> getUsers() {
        List<User> results = new ArrayList<User>();

        String[] userNames = {"John", "Paul", "George", "Ringo"};

        for (String userName : userNames) {
            results.add(new User(4L, userName, "Smith"));
        }
        return results;
    }
}
