package org.panda.initial.service.impl;

import org.panda.initial.mapper.UserMapper;
import org.panda.initial.model.entity.User;
import org.panda.initial.service.UserService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
* @author panda
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2024-03-08 22:37:55
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




