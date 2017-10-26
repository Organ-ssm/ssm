package com.spring.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.model.User;
import com.spring.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/********************************************
 * 文件名称: UserController
 * 系统名称: 资产池 V1.0
 * 模块名称: 
 * 软件版权: 恒生电子股份有限公司
 * 功能说明: 
 * 系统版本: 1.0
 * 开发人员: shi-lei
 * 开发时间: 2017-10-18 11:21
 * 审核人员: 
 * 相关文档: 
 * 修改记录: 版本信息  修改标签  修改人员  修改说明  修改单编号
 *********************************************/
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/showUser.do")
    public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String userId = request.getParameter("id");
        User user = this.userServiceImpl.selectUser(userId);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
    }

}
