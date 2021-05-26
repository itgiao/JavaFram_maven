package com.itheima.controller;

import com.itheima.bean.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;
    //查找所有账户

    @RequestMapping("/findAll")
    public String findAll() {
        System.out.println("执行了AccountController的findAll方法~！");
        List<Account> list = accountService.findAll();
        System.out.println("list=" + list);

        return "success";
    }


}
