package com.spring.dao;

import com.spring.model.User;

/**
 * Created by shilei on 2017-10-18.
 */
public interface UserDao {
    User selectUser(long id);
}
