package com.ujy.pojo;

/**
 * All rights Reserved, Designed By www.info4z.club
 * <p>title:com.ujy.pojo</p>
 * <p>ClassName:Girl</p>
 * <p>Description:TODO(请用一句话描述这个类的作用)</p>
 * <p>Compony:Info4z</p>
 * author:daidai
 * date:2019/9/19
 * version:1.0
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class Girl {
    private String name ;
    private  Integer age;

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Girl(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
