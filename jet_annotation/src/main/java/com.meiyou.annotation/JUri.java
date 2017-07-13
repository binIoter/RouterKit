package com.meiyou.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import model.RouteType;

/**
 * @author zhengxiaobin@xiaoyouzi.com
 * @since 17/5/18
 */

@Target(ElementType.TYPE) // 代表在类级别上才能使用该注解
@Retention(RetentionPolicy.SOURCE) // 代表该注解只存在源代码中，编译后的字节码中不存在
public @interface JUri {


    String[] value();

    /**
     * 类型
     *
     * @return
     */
    RouteType type() default RouteType.UI;
}