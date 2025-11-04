package com.spring.annotations.javaconfig.importresources.anno;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:monitoring_bean.xml")
@Import(JavaConfig.class)
public class RootConfig {
}
