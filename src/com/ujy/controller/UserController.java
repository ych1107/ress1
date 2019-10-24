package com.ujy.controller;

import com.ujy.service.UserService;

/**
 * All rights Reserved, Designed By www.info4z.club
 * <p>title:com.ujy.controller</p>
 * <p>ClassName:UserController</p>
 * <p>Description:TODO(请用一句话描述这个类的作用)</p>
 * <p>Compony:Info4z</p>
 * author:daidai
 * date:2019/9/19
 * version:1.0
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class UserController {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String toString() {
        return "UserController{" +
                "userService=" + userService +
                '}';
    }
    //    private UserService userService;
//
//    public UserService getUserService() {
//        return userService;
//    }
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }
//    @Override
//    public String toString() {
//        return "UserController{" +
//                "userService=" + userService +
//                '}';
//    }
}
