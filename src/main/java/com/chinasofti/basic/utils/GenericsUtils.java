package com.chinasofti.basic.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;



public class GenericsUtils {
    /**
     * Locates the first generic declaration on a class.
     *
     * @param clazz The class to introspect
     * @return the first generic declaration, or <code>null</code> if cannot be determined
     */
    public static Class getGenericClass(Class clazz) {
        return getGenericClass(clazz, 0);
    }

    /**
     * 通过反射,获得定义 Class时声明的父类的范型参数的类型. 如 public BookManager extends GenricManager<Book>
     * Locates  generic declaration by index on a class.
     *
     * @param clazz clazz The class to introspect
     * @param index the Index of the generic ddeclaration,start from 0.
     */
    public static Class getGenericClass(Class clazz, int index) {
        Type genType = clazz.getGenericSuperclass();
        System.out.println("genType  "+genType);
        if (genType instanceof ParameterizedType) {
            Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
            System.out.println("parmas"+params);
            if ((params != null) && (params.length >= (index - 1))) {
                return (Class) params[index];
            }
        }
        return null;
    }
}
