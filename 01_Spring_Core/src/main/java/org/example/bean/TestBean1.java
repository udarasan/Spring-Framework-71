package org.example.bean;

import com.sun.net.httpserver.Request;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TestBean1 {
    public TestBean1() {
        System.out.println("TestBean1 Constructor Called");
    }
}

