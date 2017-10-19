package com.spring.model;

import java.io.Serializable;
import java.util.Date;

/********************************************
 * 文件名称: User
 * 系统名称: 资产池 V1.0
 * 模块名称: 
 * 软件版权: 恒生电子股份有限公司
 * 功能说明: 
 * 系统版本: 1.0
 * 开发人员: shi-lei
 * 开发时间: 2017-10-18 11:12
 * 审核人员: 
 * 相关文档: 
 * 修改记录: 版本信息  修改标签  修改人员  修改说明  修改单编号
 *********************************************/
public class User implements Serializable{
    private String id;
    private String email;
    private String password;
    private String username;
    private String role;
    private int status;
    private Date regTime;
    private String regIp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }
}
