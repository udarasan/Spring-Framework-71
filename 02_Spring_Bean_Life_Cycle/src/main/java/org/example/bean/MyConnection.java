package org.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyConnection implements DisposableBean, BeanNameAware, BeanFactoryAware,
        ApplicationContextAware, InitializingBean {
    //the state of instantiation
    public MyConnection(){
        System.out.println("MyConnection Constructor");
    }
    //there is no method to find state of populate properties

    //bean name aware -> bean ID
    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName name is called");
    }

    //add DI to bean
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory is called");
    }
    //AOP and DP
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext is called");
    }
    //complete bean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet is called");
    }
    //context close and remove all available beans from context
    @Override
    public void destroy() throws Exception {
        System.out.println("MyConnection is Destroyed");
    }



}
