package test1.impl;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author keyuan.dky
 * @date 2018/09/09
 */
public class GetFieldFactoryBean implements FactoryBean {
    private  String targetClass;
    private  String targetField;

    public void setTargetClass(String targetClass) {
        this.targetClass = targetClass;
    }

    public void setTargetField(String targetField) {
        this.targetField = targetField;
    }

    @Override

    public Object getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
