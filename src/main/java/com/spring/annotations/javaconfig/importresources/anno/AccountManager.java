package com.spring.annotations.javaconfig.importresources.anno;
//No Source Code
public class AccountManager {

    private UsageMonitor usageMonitor;

    public void desposite(String accountNo,double amount)
    {

        System.out.println("deposite the amount");
        usageMonitor.captureData(accountNo,"deposite");
    }

    public void setUsageMonitor(UsageMonitor usageMonitor)
    {
        this.usageMonitor = usageMonitor;
    }
}
