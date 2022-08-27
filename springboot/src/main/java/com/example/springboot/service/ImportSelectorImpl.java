package com.example.springboot.service;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * Description
 * Date 2021/1/22 23:24
 * Created by kwz
 */
@Component
public class ImportSelectorImpl implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //实现了ImportSelector接口，Spring容器会初始化该类，并且调用selectImports方法
        return new String[0];
    }
}
