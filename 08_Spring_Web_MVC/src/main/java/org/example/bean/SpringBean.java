package org.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements DisposableBean, InitializingBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    private SpringBean(){
        System.out.println("SpringBean Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBean beanFactory");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBean setBeanName");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBean Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBean Afterproprties");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBean ApplicationContextAware");
    }
}
