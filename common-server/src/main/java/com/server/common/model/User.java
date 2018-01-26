package com.server.common.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018\1\25 0025.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private int tid;
    private String username;
    private String password;
    private int age;
    private int sex;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
