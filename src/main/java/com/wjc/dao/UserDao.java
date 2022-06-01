package com.wjc.dao;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    //根据id查询密码
    @Select("select password from user" +
            " where id=#{id}")
    String findPasswordByID(int id);


    @Insert("insert into user(username, password, id) values(#{username},#{password},#{id}) ")
    boolean addNewUser(@Param("username") String username, @Param("password") String password, @Param("id") int id);


    @Select("select username from user" +
            " where  id=#{id}")
    String findUserNameByID(int id);
}
