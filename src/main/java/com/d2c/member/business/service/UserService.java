package com.d2c.member.business.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.d2c.member.business.model.User;

import java.util.List;

public interface UserService {


    IPage<Object> findByName();

}
