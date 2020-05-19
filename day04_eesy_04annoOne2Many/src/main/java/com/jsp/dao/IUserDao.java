package com.jsp.dao;

import com.jsp.domain.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;
/*
    在mybatis中针对，CURD一共有四个注解
    @Select @Insert @Update @Delete
 */
@CacheNamespace(blocking = true)
public interface IUserDao {
    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from user")
    @Results(id = "userMap",value = {
            @Result(id=true,column = "id",property = "userId"),
            @Result(column = "username",property = "userName"),
            @Result(column = "address",property = "userAddress"),
            @Result(column = "sex",property = "userSex"),
            @Result(column = "birthday",property = "userBirthday"),
            @Result(property = "accounts",column = "id",
                    many = @Many(select = "com.jsp.dao.IAccountDao.findAccountByUid",
                    fetchType = FetchType.LAZY))
    })
    List<User> findAll();


    /**
     * 根据id查询用户
     * @param userId
     * @return
     */
    @Select("select * from user where id=#{id}")
    @ResultMap(value = "userMap")
    User findById(Integer userId);

    @Select("select * from user where username like '%${value}%' ")
    List<User> findUserByName(String username);

}
