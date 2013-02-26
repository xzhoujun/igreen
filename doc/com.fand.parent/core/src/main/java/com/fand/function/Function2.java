package com.fand.function;

/**
 * 方法
 * 
 * @author yaoht
 * 
 * @param <R>
 *            输出泛型
 * @param <T1>
 *            参数类型1
 * @param <T2>
 *            参数类型2
 */
public interface Function2<R, T1, T2> {
	/**
	 * 执行
	 * 
	 * @param <T1>
	 *            输入泛型参数1
	 * @param <T2>
	 *            输入泛型参数2
	 * @return 输出泛型值
	 */
	R function(T1 t1, T2 t2);
}
