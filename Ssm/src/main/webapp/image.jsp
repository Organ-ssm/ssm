<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <script type="text/javascript">
        // 刷新图片
        function changeImg() {
            var imgSrc = $("#imgObj");
            var src = imgSrc.attr("src");
            imgSrc.attr("src", changeUrl(src));
        }
        //为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳
        function changeUrl(url) {
            var timestamp = (new Date()).valueOf();
            var index = url.indexOf("?",url);
            if (index > 0) {
                url = url.substring(0, url.indexOf(url, "?"));
            }
            if ((url.indexOf("&") >= 0)) {
                url = url + "×tamp=" + timestamp;
            } else {
                url = url + "?timestamp=" + timestamp;
            }
            return url;
        }
    </script>
</head>

<body>
验证码Demo
<br/>
<div class="form-group  col-lg-6">
    <label for="id" class="col-sm-4 control-label">
        验证码:
    </label>
    <div class="col-sm-8">
        <input type="text" id="code" name="code" class="form-control" style="width:250px;"/>
        <img id="imgObj" alt="验证码" src="/validate/code" onclick="changeImg()"/>
        <a href="#" onclick="changeImg()">换一张</a>
    </div>
</div>


</body>
</html>