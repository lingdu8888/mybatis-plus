package com.d2c.member.business.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.d2c.member.business.mapper.UserMapper;
import com.d2c.member.business.model.User;
import com.d2c.member.business.model.UserView;
import com.d2c.member.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    @Transactional
    public IPage<Object> findByName() {
        QueryWrapper<UserView> queryWrapper = new QueryWrapper<>();
        //   queryWrapper= queryWrapper.eq("username","baicai");
        Page<User> page = new Page<>();
        page = page.setSize(1);
        return userMapper.findByName(page, queryWrapper);


    }

}
