package com.chinasofti.basic.utils;

import java.lang.reflect.Method;

public class VOTransfer {

	public static void transfer(Object from, Object to) {
		try {
			if ((null == from) && (null == to)) // 参数类型检查
				throw new Exception("传入的对象不存在!!!");

			Class fromClass = from.getClass();
			Class toClass = to.getClass();

			Method[] toMethods = toClass.getDeclaredMethods();
			for (int i = 0; i < toMethods.length; i++) {

				if (toMethods[i].getName().startsWith("set")) {
					try {

						Method fromMethod = fromClass.getMethod("get"
								+ toMethods[i].getName().substring(3),
								new Class[0]);

						Object[] params = new Object[] { fromMethod.invoke(
								from, new Object[0]) };

						if (params[0] != null
								&& !params[0].toString().equals("0"))
							toMethods[i].invoke(to, params);
					} catch (NoSuchMethodException ex) {
						continue;
					} catch (Exception ex) {
						ex.printStackTrace(System.err);
						throw ex;
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
