package com.incra.services;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jeff Risberg
 * @since 11/20/17
 */
public class DefaultUserService implements UserService {
    public List<String> getUsers() {
        String[] users = {"John", "Paul", "George", "Ringo"};

        return Arrays.asList(users);
    }
}
