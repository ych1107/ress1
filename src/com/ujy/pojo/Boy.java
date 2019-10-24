package com.ujy.pojo;

/**
 * All rights Reserved, Designed By www.info4z.club
 * <p>title:com.ujy.pojo</p>
 * <p>ClassName:Boy</p>
 * <p>Description:TODO(请用一句话描述这个类的作用)</p>
 * <p>Compony:Info4z</p>
 * author:daidai
 * date:2019/9/19
 * version:1.0
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class Boy {
    private String name;
    private Integer age;
    private  Girl girl ;

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    public Boy(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Boy() {
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

    @Override
    public String toString() {
        return "Boy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", girl=" + girl +
                '}';
    }
}
