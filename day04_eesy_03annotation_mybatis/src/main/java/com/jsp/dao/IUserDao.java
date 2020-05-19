package com.jsp.dao;

import com.jsp.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
/*
    在mybatis中针对，CURD一共有四个注解
    @Select @Insert @Update @Delete
 */
public interface IUserDao {
    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from user")
    List<User> findAll();

    @Insert("insert into user(username,address,sex,birthday)values(#{username},#{address},#{sex},#{birthday})")
    void saveUser(User user);

    @Update("update user set username=#{username},sex=#{sex},address=#{address},birthday=#{birthday} where id=#{id}")
    void updateUser(User user);

    @Delete("delete from user where id=#{id}")
    void deleteUser(Integer userId);

    /**
     * 根据id查询用户
     * @param userId
     * @return
     */
    @Select("select * from user where id=#{id}")
    User findById(Integer userId);

    @Select("select * from user where username like '%${value}%' ")
    List<User> findUserByName(String username);

    @Select("select count(*) from user")
    int findTotalUser();
}
