package com.example.demo.controller;

import com.example.demo.dao.Tb_testMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "demo账号服务相关的api",tags = "demo账号服务相关的api")
public class A {
    @Autowired
    private Tb_testMapper tbTestMapper;

    /**
     * 查询用户名A
     * @param 无6
     * @return String
     *
     */
    @ApiOperation(value = "接口的功能介绍",notes = "获取用户名",httpMethod = "GET")
    @GetMapping("/name")
    public String getName(){
        return tbTestMapper.selectByUserId();
    }
}
