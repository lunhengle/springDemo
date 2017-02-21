package org.lhl.spring.bean;

/**
 * Created by lunhengle on 2016/11/14.
 * 用户实体类
 */
public class User {
    /**
     * ID
     */
    private long id;
    /**
     * 用户名.
     */
    private String userName;
    /**
     * 密码.
     */
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
