package com.avatech.edi.mdm.data;

import java.util.function.Predicate;

public interface List<E> extends java.util.List<E> {

    /**
     * 第一个或默认值
     *
     * @return 元素实例
     */
    E firstOrDefault();

    /**
     * 最后一个或默认值
     *
     * @return 元素实例
     */
    E lastOrDefault();

    /**
     * 第一个或默认值
     *
     * @return 元素实例
     */
    E firstOrDefault(Predicate<? super E> filter);

    /**
     * 最后一个或默认值
     *
     * @return 元素实例
     */
    E lastOrDefault(Predicate<? super E> filter);
}
