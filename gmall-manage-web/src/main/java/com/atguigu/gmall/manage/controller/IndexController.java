package com.atguigu.gmall.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Jimmy Hao
 * 2018-07-31 18:37
 */
@Controller
public class IndexController {


    @RequestMapping("attrListPage")
    public String attrListPage(){
        return "attrListPage";
    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }

}
