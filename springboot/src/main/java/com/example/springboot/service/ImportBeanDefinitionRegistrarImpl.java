package com.example.springboot.service;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * Description
 * Date 2021/1/22 23:34
 * Created by kwz
 */
@Component
public class ImportBeanDefinitionRegistrarImpl implements ImportBeanDefinitionRegistrar {

    /***
     * Description
     * 实现了ImportBeanDefinitionRegistrar接口，Spring容器会实例化该类，
     * 兵器调用它的registerBeanDefinitions方法
     * Param [importingClassMetadata, registry]
     * return void
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

    }
}
