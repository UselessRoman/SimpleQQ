package com.wjc.service;

public interface UserService {

    String findPasswordByID(int id);

    boolean addNewUser(String username, String password, int id);
}
