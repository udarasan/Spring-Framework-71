package org.example.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {

    @Value("Udara San")
    private String name;

    @Value("sdasdq4#D#RDQWFQR$@EQFD")
    private String key;

    public SpringBean(){
        System.out.println(name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(key);
    }

    /*@Autowired(required = false)
    public SpringBean(@Value("udara-san") String name,
                      @Value("2") int number,
                      @Value("true") boolean value,
                      @Value("panadura") String address,
                      @Value("3") int id){
        System.out.println("Spring Bean Constructor : " + name);
        System.out.println("Spring Bean Constructor : " + number);
        System.out.println("Spring Bean Constructor : " + value);
        System.out.println("Spring Bean Constructor : " + address);
        System.out.println("Spring Bean Constructor : " + id);
    }
    @Autowired(required = false)
    public SpringBean(@Value("udara-san") String name,
                      @Value("2") int number,
                      @Value("panadura") String address,
                      @Value("3") int id){
        System.out.println("Spring Bean Constructor : " + name);
        System.out.println("Spring Bean Constructor : " + number);
        System.out.println("Spring Bean Constructor : " + address);
        System.out.println("Spring Bean Constructor : " + id);
    }*/
}
