package com.fand.function;

/**
 * 方法
 * 
 * @author yaoht
 * 
 * @param <R>
 *            输出泛型
 * @param <T1>
 *            输入泛型参数1
 * @param <T2>
 *            输入泛型参数2
 * @param <T3>
 *            输入泛型参数3
 * @param <T4>
 *            输入泛型参数4
 */
public interface Function4<R, T1, T2, T3, T4> {
	/**
	 * 执行
	 * 
	 * @param <T1>
	 *            输入泛型参数1
	 * @param <T2>
	 *            输入泛型参数2
	 * @param <T3>
	 *            输入泛型参数3
	 * @param <T4>
	 *            输入泛型参数4
	 * @return 输出泛型值
	 */
	R function(T1 t1, T2 t2, T3 t3, T4 t4);
}
