package com.spring.annotations.javaconfig.importresources.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportResourcesTest {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);

        AccountManager accountManager = context.getBean("accountManager", AccountManager.class);
        accountManager.desposite("12rt45",3000.00);
    }
}
