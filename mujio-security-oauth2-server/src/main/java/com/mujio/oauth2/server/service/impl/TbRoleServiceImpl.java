package com.mujio.oauth2.server.service.impl;

import com.mujio.oauth2.server.mapper.TbRoleMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.mujio.oauth2.server.service.TbRoleService;
@Service
public class TbRoleServiceImpl implements TbRoleService{

    @Resource
    private TbRoleMapper tbRoleMapper;

}
