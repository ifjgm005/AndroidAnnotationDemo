package com.example.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.TYPE)//可用在：类、接口（包括注释类型）或枚举声明
@Retention(RetentionPolicy.CLASS)//生命周期为class ，编译成.class 文件仍然存在
public @interface Factory {

    /**
     * The name of the factory
     */
    Class type();

    /**
     * The identifier for determining which item should be instantiated
     */
    String id();
}
