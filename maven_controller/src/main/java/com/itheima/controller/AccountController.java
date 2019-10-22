package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import com.sun.tracing.dtrace.Attributes;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/list")
    @ResponseBody
    public Account list(int id){

        Account account = accountService.findById(id);
        return account;
    }


    @PostConstruct
    public void init(){
        System.out.println("controller创建中。。。");
    }




}
