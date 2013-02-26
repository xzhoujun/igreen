package com.chinasofti.basic.framework.exception;

import com.chinasofti.basic.utils.ExceptionUtils;

/**
 * 异常基类
 * 
 * @author zengzj
 * 
 */
public class BaseException extends RuntimeException {

	private static final long serialVersionUID = 2703137812383120392L;

	private Throwable cause;

	public BaseException() {
		super();
	}

	public BaseException(String message) {
		super(message);
	}

	public BaseException(String message, Throwable cause) {
		super(message, cause);
		this.cause = cause;
	}

	public BaseException(Throwable cause) {
		super(cause);
		this.cause = cause;
	}

	public Throwable getCause() {
		return (this.cause == this ? null : this.cause);
	}

	public String getMessage() {
		return ExceptionUtils.buildMessage(super.getMessage(), getCause());
	}
}
