package com.spring.service.impl;

import com.spring.dao.UserDao;
import com.spring.model.User;
import com.spring.service.inter.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/********************************************
 * 文件名称: UserServiceImpl
 * 系统名称: 资产池 V1.0
 * 模块名称: 
 * 软件版权: 恒生电子股份有限公司
 * 功能说明: 
 * 系统版本: 1.0
 * 开发人员: shi-lei
 * 开发时间: 2017-10-18 11:21
 * 修改记录: 版本信息  修改标签  修改人员  修改说明  修改单编号
 *********************************************/
@Component("userServiceImpl")
public class UserServiceImpl implements UserServiceInter {
    @Autowired
    private UserDao userdDao;
    @Override
    public User selectUser(long userId) {
        return this.userdDao.selectUser(userId);
    }
}
