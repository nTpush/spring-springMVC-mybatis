package com.nt.controller;

import com.nt.dao.UserMapper;
import com.nt.model.User;
import com.nt.service.UserService;
import com.nt.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("index")
public class IndexController {

    @Autowired
    UserMapper userMapper;


    @Autowired
    UserService userService;
    /**
     * 第一个路由跳转
     * @return ModelAndView
     */
    @RequestMapping({"","/"})
    public ModelAndView index() {
        ModelMap modelMap = new ModelMap();
        modelMap.put("name", "shining");

        List<User> userList = userService.selectList();

        for (int i = 0; i < userList.size(); i++) {
            User str = userList.get(i);
            System.out.println(str.getName());
        }

        if(!CollectionUtils.isEmpty(userList)) {
            modelMap.put("user", userList.get(0));
        }

        return new ModelAndView("hello", modelMap);
    }
}
