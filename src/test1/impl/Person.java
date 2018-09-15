package test1.impl;

import java.lang.reflect.Field;

/**
 * @author keyuan.dky
 * @date 2018/09/09
 */

public class Person {
    public String name;
    private Integer age;
    private String sex;
    //省略所有属性的set、get方法

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static void main(String[] args) throws NoSuchFieldException, SecurityException,IllegalAccessException{
        Person person =new Person();
        person.setName("VipMao");
        person.setAge(24);
        person.setSex("男");

        Person person1 =new Person();
        person1.setName("dky");
        person1.setAge(26);
        person1.setSex("男");

        //通过Class.getDeclaredField(String name)获取类或接口的指定属性值。
        Field f1=person.getClass().getDeclaredField("name");
        System.out.println("-----Class.getDeclaredField(String name)用法-------");
        System.out.println(f1.get(person));
        System.out.println(f1.get(person1));

        System.out.println("-----Class.getDeclaredFields()用法-------");
        //通过Class.getDeclaredFields()获取类或接口的指定属性值。
        Field []f2=person.getClass().getDeclaredFields();
        for(Field field:f2)
        {
            field.setAccessible(true);
            System.out.println(field.get(person));
        }
        //修改属性值
        System.out.println("----修改name属性------");
        f1.set(person, "Maoge");
        //修改后再遍历各属性的值
        Field []f3=person.getClass().getDeclaredFields();
        for(Field fields:f3)
        {
            fields.setAccessible(true);
            System.out.println(fields.get(person));
        }


    }
}
