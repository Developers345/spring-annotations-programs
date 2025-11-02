package com.spring.annotations.javaconfig.primitive.env;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.io.IOException;
import java.util.Properties;

@Configuration
@PropertySource("classpath:application_env.properties")
public class EnvConfig {
    @Autowired
    /*
    Whenever you write the @PropertySource annontation in JavaConfig class then inside the ioc container one object is created(Enviornment).
    Enviornment object holds the references of multiple propertySource objects like chain.
    whenever you called env.getProperty("key") then env object internally goes to propertySource object get it.
     */
    private Environment env;
    @Bean
    public Player player() throws IOException {
        Player player = new Player();
        System.out.println(this.getClass().getName());

        player.setPlayerNo(Integer.parseInt(env.getProperty("playerNo")));
        player.setPlayerName(env.getProperty("playerName"));
        player.setTeam(env.getProperty("team"));
        player.setRank(Integer.parseInt(env.getProperty("rank")));

        /*
        Here problem is we only read data from properties file
        munually so if same properties file need another method
        write same code in another method.
        if we create spereate method and call also not required
        because spring provides the @PropertySource annotation.

        Properties props = new Properties();
        props.load(this.getClass().getResourceAsStream("/application_env.properties"));
        player.setPlayerNo(Integer.parseInt(props.getProperty("playerNo")));
        player.setPlayerName(props.getProperty("playerName"));
        player.setTeam(props.getProperty("team"));
        player.setRank(Integer.parseInt(props.getProperty("rank")));
       */

        /*
        Here you hardcoded the values in code
        again we need to change code
        re-complie, re-reploy required.
        player.setPlayerNo(101);
        player.setPlayerName("Sachin");
        player.setTeam("India");
        player.setRank(1);
        */

        return player;
    }
}
