package org.lhl.spring.dao.impl;

import org.lhl.spring.bean.User;
import org.lhl.spring.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by lunhengle on 2016/11/14.
 * 用户dao 实现类
 */
@Repository
public class IUserDaoImpl implements IUserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 根据id 得到用户.
     *
     * @param id 用户id
     * @return 用户
     */
    public final User getUser(final long id) {
        return (User) jdbcTemplate.queryForObject("SELECT * FROM USER WHERE ID = ?", new Object[]{id}, new RowMapper() {
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getLong("ID"));
                user.setUserName(rs.getString("USERNAME"));
                user.setPassword(rs.getString("PASSWORD"));
                return user;
            }
        });
    }

    /**
     * 得到用户List.
     *
     * @return 用户list
     */
    public List<User> getUserList() {
        return null;
    }
}
