package test1.impl;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import test1.Axe;
import test1.Person;

/**
 * @author keyuan.dky
 * @date 2018/09/02
 */
public class Chinese implements BeanNameAware, Person, DisposableBean {
    private String name;
    private Axe axe;
    private String beanName;
    public Dog dog;

    static {
        System.out.println("chinese staic test");
    }
    public Chinese(){
        this.name ="中国人";
        System.out.println("hhh");
    }


    Chinese(Axe axe) {
        this.axe = axe;
    }

    @Override
    public void useAxe() {
        System.out.println(axe.chop());
    }

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    public void printName() {
        System.out.println("name :" + name);
    }

    private void close() {
        System.out.println("close 111111111");
    }

    @Override
    public void destroy() {
        System.out.println("destroy 222222222");
    }

}

