package org.panda.initial.service;

import org.panda.initial.model.entity.User;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author panda
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2024-03-08 22:37:55
*/
@Component
public interface UserService extends IService<User> {

}
