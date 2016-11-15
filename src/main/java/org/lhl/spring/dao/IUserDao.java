package org.lhl.spring.dao;

import org.lhl.spring.bean.User;

import java.util.List;

/**
 * Created by lunhengle on 2016/11/14.
 * 用户dao 接口
 */
public interface IUserDao {
    /**
     * 根据id 得到用户.
     *
     * @param id 用户id
     * @return 用户
     */
    User getUser(final long id);

    /**
     * 得到用户List.
     *
     * @return 用户list
     */
    List<User> getUserList();
}
