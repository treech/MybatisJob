package org.mybatis.example.entity;

import lombok.Data;

@Data
public class AccountUser extends Account {
    private User user;

    @Override
    public String toString() {
        return super.toString() + ",AccountUser{" +
                "user=" + user +
                '}';
    }
}
