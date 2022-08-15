package com.fd.api.controller;

import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户信息
 *
 * @author ruoyi
 */
@RestController
@RequestMapping("/user")
public class SysUserController extends BaseController {

    /**
     * 获取用户列表
     */
    @RequiresPermissions("no")
    @GetMapping("/test")
    public String test() {
        return "test";
    }

}
