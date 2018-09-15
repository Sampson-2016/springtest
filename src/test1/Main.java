package test1;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import test1.impl.Chinese;

import java.lang.reflect.Field;

/**
 * @author keyuan.dky
 * @date 2018/09/02
 */
public class Main {
    public static void main(String[] args) throws Exception{
           ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:WEB-INF/*Context.xml");

        //ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
        //    "/web/WEB-INF/applicationContext.xml");
        //
        //Resource isr = new ClassPathResource("/WEB-INF/applicationContext.xml");
        //DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        //new XmlBeanDefinitionReader(factory).loadBeanDefinitions(isr);
        Chinese p = (Chinese)applicationContext.getBean("dky");
        p.printName();

        p.useAxe();
        System.out.println();
        //Resource resource =applicationContext.getResource("classpath:web.xml");
        //System.out.println(resource);
        //System.out.println(resource.getInputStream());
        ((ClassPathXmlApplicationContext)applicationContext).registerShutdownHook();
    }
}
