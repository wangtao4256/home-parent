package com.home.wangtao.homeadmin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.home.wangtao.homeadmin.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<UserDO> {
}
