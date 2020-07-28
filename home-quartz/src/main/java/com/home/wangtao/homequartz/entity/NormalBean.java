package com.home.wangtao.homequartz.entity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 一个简单的bean
 */
@Slf4j
public class NormalBean implements BeanNameAware , ApplicationContextAware , InitializingBean , DisposableBean {
    private Beantype beanType;

    public NormalBean(){
        this(Beantype.NORMAL);
    }
    public NormalBean(Beantype beanType){
        this.beanType=beanType;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName,bean name:{}"+name);
        log.info("setBeanName,bean name:", name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext, applicationContext :"+applicationContext);
        log.info("setApplicationContext, applicationContext", applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet"+beanType);
        log.info("{}, afterPropertiesSet", beanType);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy"+beanType);
    }
}
