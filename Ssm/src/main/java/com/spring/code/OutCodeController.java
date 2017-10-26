package com.spring.code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/********************************************
 * 文件名称: OutCodeController
 * 软件版权: 恒生电子股份有限公司
 * 功能说明:
 * 系统版本: 1.0
 * 开发人员: shi-lei
 * 开发时间: 2017-10-26 14:24
 * 修改记录: 版本信息  修改标签  修改人员  修改说明  修改单编号
 *********************************************/
@Controller
@RequestMapping("/validate")
public class OutCodeController {
    /**
     * 输出验证码方法
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/code")
    public String validateCode(HttpServletRequest request, HttpServletResponse response) throws Exception{
        // 设置响应的类型格式为图片格式
        response.setContentType("image/jpeg");
        //禁止图像缓存。
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);

        HttpSession session = request.getSession();

        ImageGenerate vCode = new ImageGenerate(120,40,5,100);
        session.setAttribute("code", vCode.getCode());
        vCode.write(response.getOutputStream());
        return null;
    }
}
