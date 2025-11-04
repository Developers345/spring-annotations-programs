package com.spring.annotations.javaconfig.importresources.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public AccountManager accountManager(UsageMonitor usageMonitor)
    {
        AccountManager accountManager = new AccountManager();
        accountManager.setUsageMonitor(usageMonitor);
        return accountManager;
    }
}
