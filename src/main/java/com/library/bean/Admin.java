package com.library.bean;

public class Admin {//创建管理员类，实体类中声明了管理员的id，password，和username以及各种属性的get和set方法。

    private long adminId;
    private String password;
    private String username;

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
