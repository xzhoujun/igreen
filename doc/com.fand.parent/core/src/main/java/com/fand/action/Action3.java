package com.fand.action;

/**
 * 动作
 * 
 * @author yaoht
 * @param <T1>
 *            输入泛型1
 * @param <T2>
 *            输入泛型2
 * @param <T3>
 *            输入泛型3
 */
public interface Action3<T1, T2, T3> {
	/**
	 * 运行
	 * 
	 * @param t1
	 *            输入泛型参数1
	 * @param t2
	 *            输入泛型参数2
	 * @param t3
	 *            输入泛型参数3
	 */
	public void action(T1 t1, T2 t2, T3 t3);
}
