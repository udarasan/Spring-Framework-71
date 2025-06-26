package org.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBeanOne implements ApplicationContextAware , BeanNameAware, DisposableBean, BeanFactoryAware, InitializingBean {
    public SpringBeanOne() {
        System.out.println("SpringBeanOne Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBeanOne setBeanFactory");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBeanOne setBeanName");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBeanOne destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBeanOne afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBeanOne setApplicationContext");
    }
}
