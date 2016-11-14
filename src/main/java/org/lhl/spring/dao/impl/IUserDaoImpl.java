package org.lhl.spring.dao.impl;

import org.lhl.spring.bean.User;
import org.lhl.spring.dao.IUserDao;
import org.springframework.stereotype.Repository;

/**
 * Created by lunhengle on 2016/11/14.
 * 用户dao 实现类
 */
@Repository
public class IUserDaoImpl implements IUserDao {
    /**
     * 根据id 得到用户.
     *
     * @param id 用户id
     * @return 用户
     */
    public final User getUser(final long id) {
        User user = new User();
        user.setUserName("lunhengle");
        user.setPassword("123456");
        return user;
    }
}
