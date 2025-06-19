package org.example.config;

import org.example.bean.MyConnection;
import org.example.bean.TestBean2;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "org.example.bean")
public class AppConfig {
    @Bean("san")
    @Scope("prototype")
    public MyConnection getConnection() {
        return new MyConnection();
    }
}
