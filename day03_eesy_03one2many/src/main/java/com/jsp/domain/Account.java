
package com.jsp.domain;

import java.io.Serializable;

/**
 * @author mac
 * @create 2019/9/27
 */
public class Account implements Serializable {

    private Integer id;
    private Integer uid;
    private Double money;

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Acount{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                '}';
    }


}