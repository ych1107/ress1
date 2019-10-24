package com.ujy.test;

import com.ujy.controller.UserController;
import com.ujy.service.UserService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * All rights Reserved, Designed By www.info4z.club
 * <p>title:com.ujy.test</p>
 * <p>ClassName:UserTest</p>
 * <p>Description:TODO(请用一句话描述这个类的作用)</p>
 * <p>Compony:Info4z</p>
 * author:daidai
 * date:2019/9/19
 * version:1.0
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class UserTest {
    @Test
    public void test() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserController userController = (UserController) applicationContext.getBean("userController");
//        UserService userService = userController.getUserService();
//        userService.sayHello();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = (UserController) applicationContext.getBean("userController");
        UserService userService = userController.getUserService();
        userService.sayHello();

        //父类引用指向子类对象
        //引用:
        //变量名

        //jvm
        //1.堆,引用数据类型 UserServiceImpl
        //2.栈,四类八种

            //    userservice--->堆--->对象/string-->接口能不能创建对象? X

                //多态 -->  子类属于父类的一种,子类型和父类型一致

           //     Animal --> Person extend是Animal --> Person is an Animal !
            //    Action --> eat --> eatting is one of an Action

            //    只有这两种情况才能构成多态

        //3.方法区
    }
}

