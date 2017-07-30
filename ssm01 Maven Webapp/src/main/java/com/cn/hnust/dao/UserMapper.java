package com.cn.hnust.dao;

import java.util.List;

import com.cn.hnust.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);
    
    User selectByPwd(User userid);
    
    User selectByEmail(User user);
    
    User selectByUsername(User user);
    
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    /**
     * 筛选所有用户
     * @return
     */
    List<User> selectAllUser();
}