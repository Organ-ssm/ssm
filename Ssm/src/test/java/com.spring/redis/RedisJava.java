package com.spring.redis;

import redis.clients.jedis.Jedis;

/********************************************
 * 文件名称: RedisJava
 * 系统名称: 资产池 V1.0
 * 模块名称: 
 * 软件版权: 恒生电子股份有限公司
 * 系统版本: 1.0
 * 开发人员: shi-lei
 * 开发时间: 2017-10-19 15:30
 * 修改记录: 版本信息  修改标签  修改人员  修改说明  修改单编号
 *********************************************/
public class RedisJava {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
    }
}
