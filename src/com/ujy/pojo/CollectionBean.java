package com.ujy.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * All rights Reserved, Designed By www.info4z.club
 * <p>title:com.ujy.pojo</p>
 * <p>ClassName:CollectionBean</p>
 * <p>Description:TODO(请用一句话描述这个类的作用)</p>
 * <p>Compony:Info4z</p>
 * author:daidai
 * date:2019/9/19
 * version:1.0
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class CollectionBean {
    Object [] arr ;
    List list ;
    Map map ;
    Properties properties;

    @Override
    public String toString() {
        return "CollectionBean{" +
                "arr=" + Arrays.toString(arr) +
                ", list=" + list +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }

    public Object[] getArr() {
        return arr;
    }

    public void setArr(Object[] arr) {
        this.arr = arr;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
