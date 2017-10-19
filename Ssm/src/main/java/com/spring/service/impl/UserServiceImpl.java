package com.spring.service.impl;

import com.spring.dao.UserDao;
import com.spring.model.User;
import com.spring.service.inter.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.io.*;
import java.util.List;

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
    public User selectUser(String userId) {
        //连接本地redis服务
        User user = null;
        Object obj = null;
        Jedis jedis = new Jedis("localhost");
        //进行redis判断 redis中有指定数据 直接返回 否则执行后续查询操作
        byte[] byt = jedis.get(userId.getBytes());
        if(byt != null){
            //对象反序列化
             obj = unserizlize(byt);
            if(obj instanceof User){
                return (User)obj ;
            }
        }
        else{
            user = userdDao.selectUser(userId);
            //将user对象存入redis 需序列化
            jedis.set(userId.getBytes(),serialize(user));
        }
        return user;
    }
    //序列化
    public static byte [] serialize(Object obj){
        ObjectOutputStream obi=null;
        ByteArrayOutputStream bai=null;
        try {
            bai=new ByteArrayOutputStream();
            obi=new ObjectOutputStream(bai);
            obi.writeObject(obj);
            byte[] byt=bai.toByteArray();
            return byt;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    //反序列化
    public static Object unserizlize(byte[] byt){
        ObjectInputStream oii=null;
        ByteArrayInputStream bis=null;
        bis=new ByteArrayInputStream(byt);
        try {
            oii=new ObjectInputStream(bis);
            Object obj=oii.readObject();
            return obj;
        } catch (Exception e) {

            e.printStackTrace();
        }


        return null;
    }
}
