package com.spring.redis;

import redis.clients.jedis.Jedis;

import java.util.List;

/********************************************
 * 文件名称: RedisString
 * 系统名称: 资产池 V1.0
 * 软件版权: 恒生电子股份有限公司
 * 系统版本: 1.0
 * 开发人员: shi-lei
 * 开发时间: 2017-10-19 15:37
 * 修改记录: 版本信息  修改标签  修改人员  修改说明  修改单编号
 *********************************************/
public class RedisString {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //存储数据到列表中
        jedis.lpush("site-list", "波波");
        jedis.lpush("site-list", "看");
        jedis.lpush("site-list", "国产鬼片");
        // 获取存储的数据并输出
        List<String> list = jedis.lrange("site-list", 0 ,2);
        for(int i=0; i<list.size(); i++) {
            System.out.println("列表项为: "+list.get(i));
        }
    }
}
