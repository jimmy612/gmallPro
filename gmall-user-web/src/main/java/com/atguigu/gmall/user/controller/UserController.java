package com.atguigu.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Jimmy Hao
 * 2018-07-30 20:02
 */
@RestController
public class UserController {
    @Reference
    UserService userService;

    @RequestMapping("index")
    public List<UserInfo> userInfoList() {
        List<UserInfo> userInfoList = userService.userInfoList();
        return userInfoList;
    }

}
