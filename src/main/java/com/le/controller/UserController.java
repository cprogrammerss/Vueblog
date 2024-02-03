package com.le.controller;


import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.le.common.lang.Result;
import com.le.entity.User;
import com.le.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Le
 * @since 2024-02-03
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("/index")
    public Result index(){
        User user =  userService.getById(1L);
        return Result.succ(200, "操作成功", user);
    }
}
