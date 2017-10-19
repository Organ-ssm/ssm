package com.spring.redis;

import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.Set;

/********************************************
 * 文件名称: RedisKey
 * 系统名称: 资产池 V1.0
 * 模块名称: 
 * 软件版权: 恒生电子股份有限公司
 * 功能说明: 
 * 系统版本: 1.0
 * 开发人员: shi-lei
 * 开发时间: 2017-10-19 15:45
 * 审核人员: 
 * 相关文档: 
 * 修改记录: 版本信息  修改标签  修改人员  修改说明  修改单编号
 *********************************************/
public class RedisKey {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");

        // 获取数据并输出
        Set<String> keys = jedis.keys("*");
        Iterator<String> it=keys.iterator() ;
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key);
        }
    }
}
