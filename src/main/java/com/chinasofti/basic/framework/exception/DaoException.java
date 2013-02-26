package com.chinasofti.basic.framework.exception;

/**
 * DAO层异常基类
 * @author zengzj
 *
 */
public class DaoException extends BaseException {

	private static final long serialVersionUID = 5243814332423265850L;

	public DaoException() {

		super();
		
	}

	public DaoException(String err) {

		super("DAOException:==>" + err);
		
	}
	public DaoException(Throwable ex) {
		super(ex);
	}
	public DaoException(String msg, Throwable ex) {
		super(msg, ex);
	}
}
