package org.lhl.spring.service.impl;

import org.lhl.spring.bean.User;
import org.lhl.spring.dao.IUserDao;
import org.lhl.spring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lunhengle on 2016/11/14.
 * 用户service
 */
@Service
public class IUserServiceImpl implements IUserService {
    /**
     * 注入dao.
     */
    @Autowired
    private IUserDao iUserDao;


    /**
     * 根据id 得到用户.
     *
     * @param id 用户id
     * @return 用户
     */
    public final User getUser(final long id) {
        return iUserDao.getUser(id);
    }
}
