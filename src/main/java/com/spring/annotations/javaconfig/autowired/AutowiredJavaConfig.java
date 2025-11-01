package com.spring.annotations.javaconfig.autowired;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AutowiredJavaConfig {

    @Bean
    public Rocket rocket1()
    {
        Rocket rocket = new Rocket();
        System.out.println("rocket1");
        return rocket;
    }
    @Bean
    @Primary // Consider this bean and don't consider remaining beans(equals to autowired-candidate = false)
    public Rocket rocket2()
    {
        Rocket rocket = new Rocket();
        System.out.println("rocket2");
        return rocket;
    }
    //@Bean(autowire = Autowire.BY_NAME) -> This one decrepated from spring 5.x
    //instead of using above use method parameter injection
    //@Autowired -> Here also not possible because @Autowired anootation inject the dependency byType only and place where you can write based on that i t will inject
    @Bean
   /* @Qualifier("rocket1") -> It will not use in java configuration apporach
    In Spring bean configuration we defined in bean level so ioc easliy identifed
    In Java configuration approach we wrote in method level due to that ioc got
    confused what bean i need to inject.
    */

    public Launcher launcher(Rocket rocket)
    {
        Launcher launcher = new Launcher();
        /*//#1 apporach
    Rocket rocket = new Rocket
    launcher.setRocket(rocket);

    #2 appoarch
     Rocket rocket = rocket();
     launcher.setRocket(rocket);
     The above 2 approaches are not recommaned because for 2 approaches developer maintain the depencies
     Lancher-> Rocket-> Signal (this complexity will take care by developer)
    */
        launcher.setRocket(rocket);
        return launcher;
    }
}
