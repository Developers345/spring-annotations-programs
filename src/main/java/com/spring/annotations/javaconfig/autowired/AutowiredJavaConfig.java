package com.spring.annotations.javaconfig.autowired;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutowiredJavaConfig {

    @Bean
    public Rocket rocket()
    {
        Rocket rocket = new Rocket();
        return rocket;
    }
    //@Bean(autowire = Autowire.BY_NAME) -> This one decrepated from spring 5.x
    //instead of using above use method parameter injection
    //@Autowired -> Here also not possible because @Autowired anootation inject the dependency byType only and place where you can write based on that i t will inject
    @Bean
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
