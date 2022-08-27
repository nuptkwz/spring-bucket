package com.example.springboot.service;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * Description
 * Date 2021/1/22 23:27
 * Created by kwz
 */
@Component
public class DeferredImportSelectorImpl implements DeferredImportSelector {
    /**
     * Description
     * DeferredImportSelector是ImportSelector的子类，区别在于DeferredImportSelector
     * 实例的 selectImports方法比ImportSelector实例要晚，要等到
     * @Configuration  注解相关的业务都处理完才会调用
     * Param [importingClassMetadata]
     * return java.lang.String[]
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[0];
    }
}
