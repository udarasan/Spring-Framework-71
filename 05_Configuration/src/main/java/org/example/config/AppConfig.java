package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "org.example.bean")
@Import({AppConfig1.class, AppConfig2.class})
//@ImportResource("classpath:hibernate.cfg.xml")
//@ImportResource("file:absolute-path-of-hibernate.cfg.xml")
public class AppConfig {
}
