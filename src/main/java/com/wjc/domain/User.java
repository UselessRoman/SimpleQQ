package com.wjc.domain;

public class User {
    private String userName;
    private String password;
    private int id;
    private String ipAddr;

    public User(String userDescription) {
        String items[] = userDescription.split("%");  //把字符串用%分割
        this.userName = items[0];    //第一部分赋给用户名
        this.ipAddr = items[1];  //第二部分赋给IP地址
    }

    public User(String name, String ipAddr) {
        this.userName = name;
        this.ipAddr = ipAddr;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                '}';
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String description() {
        return userName + "%" + ipAddr;  //统一用 “用户名” + “%” + “IP地址” 的形式表示
    }
}
