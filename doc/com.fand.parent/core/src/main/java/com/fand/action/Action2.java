package com.fand.action;

/**
 * 动作
 * 
 * @author yaoht
 * @param <T1>
 *            输入泛型1
 * @param <T2>
 *            输入泛型2
 */
public interface Action2<T1, T2> {
	/**
	 * 运行
	 * 
	 * @param t1
	 *            输入泛型参数1
	 * @param t2
	 *            输入泛型参数2
	 */
	public void action(T1 t1, T2 t2);
}
