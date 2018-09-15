package test1;

import com.sun.tools.javac.util.Assert;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;

/**
 * @author keyuan.dky
 * @date 2018/09/09
 */
public class Main2 {
    public static void main(String[] args) throws Exception{

        ClassPathResource classPathResource = new ClassPathResource("WEB-INF/*eb.xml");
        InputStream input = classPathResource.getInputStream();
        System.out.println(input.toString());
        System.out.println(classPathResource.getPath());
        System.out.println(classPathResource.getDescription());
        System.out.println(classPathResource.getFilename());

    }
}
