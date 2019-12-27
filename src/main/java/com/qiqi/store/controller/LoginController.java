package com.qiqi.store.controller;

import com.qiqi.store.dto.UserAuthDTO;
import com.qiqi.store.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiqi
 * @date 2019/12/27 0027
 */

@Api(tags = "登录")
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    @ApiOperation("登录")
    public Boolean login(@RequestBody UserAuthDTO dto) {
        return loginService.login(dto);
    }

    @PostMapping("/register")
    @ApiOperation("注册")
    public Long register(@RequestBody UserAuthDTO dto) {
        return loginService.register(dto);
    }
}
