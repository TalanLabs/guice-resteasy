package com.talanlabs.guiceresteasy;

import java.util.Comparator;

public class OrderComparator implements Comparator<Class<?>> {

    @Override
    public int compare(Class<?> o1, Class<?> o2) {
        Order order1 = o1 != null ? o1.getAnnotation(Order.class) : null;
        Order order2 = o2 != null ? o2.getAnnotation(Order.class) : null;
        int v1 = order1 != null ? order1.value() : Integer.MAX_VALUE;
        int v2 = order2 != null ? order2.value() : Integer.MAX_VALUE;
        return Integer.compare(v1, v2);
    }
}
