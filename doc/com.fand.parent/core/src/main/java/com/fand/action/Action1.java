package com.fand.action;

/**
 * 动作
 * 
 * @author yaoht
 * @param <T1>
 *            输入泛型1
 */
public interface Action1<T1> {
	/**
	 * 运行
	 * 
	 * @param t1
	 *            输入泛型参数1
	 */
	public void action(T1 t1);
}
