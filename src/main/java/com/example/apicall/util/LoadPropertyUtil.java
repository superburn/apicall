package com.example.apicall.util;

import org.springframework.core.env.Environment;


public class LoadPropertyUtil /*implements EnvironmentAware*/ {

    //static Environment environment;
    private static Environment environment = (Environment) SpringUtils.getBean(Environment.class);


    /*@Override
    public void setEnvironment(Environment environment) {
        LoadPropertyUtil.environment = environment;
    }*/

    public static String getProperty(String key) {
        return environment.getProperty(key);
    }

}
