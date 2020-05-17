package com.example.demo2.web;

import com.example.demo2.model.Result;
import com.example.demo2.model.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/info")
    public Result getInfo(){
        return Result.ok(200,"获取成功",(User) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
