package com.spring.dao;

import com.spring.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/********************************************
 * 文件名称: UserDaoTest
 * 系统名称: 资产池 V1.0
 * 模块名称: 
 * 软件版权: 恒生电子股份有限公司
 * 功能说明: 
 * 系统版本: 1.0
 * 开发人员: shi-lei
 * 开发时间: 2017-10-18 16:16
 * 审核人员: 
 * 相关文档: 
 * 修改记录: 版本信息  修改标签  修改人员  修改说明  修改单编号
 *********************************************/
public class UserDaoTest {
    // 加载spring配置文件
    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration({"classpath:spring-mybatis.xml"})
    public class IUserDaoTest {

        @Autowired
        private UserDao userdao;

        @Test
        public void testSelectUser() throws Exception {
            long id = 1;
            User user = userdao.selectUser(id);
            System.out.println(user.getUsername());
        }

    }
}
