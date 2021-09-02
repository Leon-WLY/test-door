package org.itstack.demo.web;

import lombok.extern.slf4j.Slf4j;
import org.itstack.demo.domain.ResultVo;
import org.itstack.demo.domain.UserInfo;
import org.itstack.door.annotation.DoDoor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloWorldController {
    @DoDoor(key = "userId", returnJson = "{\"code\":\"1111\",\"message\":\"非白名单可访问用户拦截！\"}")
    @RequestMapping(path = "/api/queryUserInfo", method = RequestMethod.GET)
    public ResultVo queryUserInfo(@RequestParam String userId) {
        log.info("请求进入");
        UserInfo userInfo = new UserInfo("虫虫:" + userId, 19, "天津市南开区旮旯胡同100号");
        ResultVo resultVo = new ResultVo();
        resultVo.setCode("200");
        resultVo.setMessage("获取信息成功。");
        resultVo.setData(userInfo);
        return resultVo;
    }
}
