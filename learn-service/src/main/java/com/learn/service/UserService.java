package com.learn.service;

import com.learn.pojo.Users;
import com.learn.pojo.bo.UserBO;

public interface UserService {
    /**
     * 判断用户名是否存在
     */
    public boolean queryUsernameIsExist(String username);

    /**
     * 创建用户
     *
     * @param userBO userBO
     * @return Users
     */
    public Users createUser(UserBO userBO);

    /**
     * 检索用户名和密码是否匹配，用于登陆
     *
     * @param username String
     * @param password String
     * @return Users
     */
    public Users queryUserForLogin(String username, String password);
}
