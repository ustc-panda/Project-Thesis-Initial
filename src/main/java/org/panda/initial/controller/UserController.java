package org.panda.initial.controller;

import javax.annotation.Resource;

import org.panda.initial.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sunweipeng <https://github.com/ustc-panda?tab=repositories>
 * Created on 2024-03-08
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    private UserService userService;


}
