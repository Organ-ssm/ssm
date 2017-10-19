package com.spring.service.inter;

import com.spring.model.User;

/**
 * Created by shilei on 2017-10-18.
 */
public interface UserServiceInter {
    /**根据Id查询用户
     * @param userId
     * @return
     */
    public User selectUser(String userId);
}
