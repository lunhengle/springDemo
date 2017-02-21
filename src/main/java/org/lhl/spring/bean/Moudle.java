package org.lhl.spring.bean;

/**
 * Created by lunhengle on 2016/12/8.
 * 模块功能表
 */
public class Moudle {
    /**
     * id.
     */
    private int id;
    /**
     * 父id.
     */
    private int parentId;
    /**
     * 等级 1 2 3
     */
    private int rank;
    /**
     * 名称.
     */
    private String name;
    /**
     * 标识.
     */
    private String identifier;
    /**
     * 链接地址.
     */
    private String linkAddress;
    /**
     * 是否启用 1 启用 0 不启用.
     */
    private int enable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getLinkAddress() {
        return linkAddress;
    }

    public void setLinkAddress(String linkAddress) {
        this.linkAddress = linkAddress;
    }

    public int getEnable() {
        return enable;
    }

    public void setEnable(int enable) {
        this.enable = enable;
    }
}
