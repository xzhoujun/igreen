package com.chinasofti.basic.framework.exception;

/**
 * 服务层异常基类
 * @author Administrator
 *
 */
public class BusinessException extends BaseException {

	private static final long serialVersionUID = 5243814332423265850L;

	public BusinessException() {

		super();
	}

	public BusinessException(String err) {

		super("ServicesException:==>" + err);
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}

	public BusinessException(Throwable cause) {
		super(cause);
	}
}
