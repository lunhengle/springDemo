package org.lhl.spring.bean;

/**
 * Created by lunhengle on 2016/12/8.
 * 用户权限表
 */
public class Authentication {
    /**
     * ID.
     */
    private int id;
    /**
     * 用户id.
     */
    private String userId;
    /**
     * 模块id.
     */
    private String moduleId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }
}
