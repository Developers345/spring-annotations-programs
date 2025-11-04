package com.spring.annotations.javaconfig.importanno;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ServiceConfig.class,UIConfig.class})
public class RootConfig {
}
