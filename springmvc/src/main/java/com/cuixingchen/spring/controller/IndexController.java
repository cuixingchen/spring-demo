package com.cuixingchen.spring.controller;

import com.cuixingchen.spring.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by cuipengfei1 on 2017/9/8.
 */
@Controller
@RequestMapping(value = "/index")
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private IndexService indexServiceImpl;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String IndexPage(@RequestParam(value = "param", required = false) String param, Model model) {
        try {
            if ("error".equals(param)) {
                throw new RuntimeException("跳转error页面测试");
            }
            indexServiceImpl.printIndex(param);
            model.addAttribute("msg", "成功");
            return "index";
        } catch (Exception e) {
            logger.error("IndexController->IndexPage异常：", e);
            model.addAttribute("msg", e.getMessage());
        }
        return "error";
    }
}
