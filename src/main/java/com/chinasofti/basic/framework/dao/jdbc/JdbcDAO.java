package com.chinasofti.basic.framework.dao.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.CallableStatementCreator;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.chinasofti.basic.framework.common.Page;

/**
 * JDBC DAO
 * @author zengzj
 *
 */
public class JdbcDAO extends JdbcDaoSupport {
	Logger log = Logger.getLogger(this.getClass()); // 定义日志记录器

	
	public Connection getNativeConn() {

		// 从当前线程绑定的数据连接获取连接
		Connection conn = DataSourceUtils.getConnection(this.getJdbcTemplate()
				.getDataSource());
		try {
			conn = this.getJdbcTemplate().getNativeJdbcExtractor()
					.getNativeConnection(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

		return conn;
	}

	/**
	 * 提供对表的更改和删除操作
	 * 
	 * @param sql
	 *            要执行的sql语句
	 * @param args
	 *            变参
	 * @return 影响的行数
	 */
	public int update(String sql, Object... args) {
		return this.getJdbcTemplate().update(sql, args);
	}

	/**
	 * 获取行数
	 * 
	 * @param countSql
	 *            计算行数的sql语句
	 * @return
	 */
	public int countRows(String countSql) {
		return this.getJdbcTemplate().queryForInt(countSql);
	}

	/**
	 * sql查询，无分页
	 * 
	 * @param sql
	 * @param param
	 * @return List集合
	 */
	public List queryList(String sql, Object... param) {

		return getJdbcTemplate().queryForList(sql, param);

	}

	/**
	 * sql查询，无分页
	 * 
	 * @param sql
	 * @param param
	 * @return SqlRowSet结果集
	 */
	public SqlRowSet queryRS(String sql, Object... param) {

		return getJdbcTemplate().queryForRowSet(sql, param);

	}

	/**
	 * sql查询，无分页
	 * 
	 * @param sql
	 * @param param
	 * @return Map集合
	 */
	public Map queryMap(String sql, Object... param) {

		return getJdbcTemplate().queryForMap(sql, param);

	}

	/**
	 * SQL分页查询 未修正
	 * 
	 * @param sql
	 * @param pageNum
	 * @param pageSize
	 * @param values
	 * @return
	 */
	public Page findByPageMySql(String sql, int pageNum, int pageSize,
			Object... values) {
		List result = new ArrayList();
		StringBuffer totalSQL = new StringBuffer(" SELECT count(*) FROM ( ");
		totalSQL.append(sql);
		totalSQL.append(" ) totalTable ");
		int totalCount = getJdbcTemplate().queryForInt(totalSQL.toString(),
				values);
		int totalPageCount = (totalCount + pageSize - 1) / pageSize;// 取总页数
		if (pageNum > totalPageCount) {
			pageNum = totalPageCount;
		}

		
		result = getJdbcTemplate().queryForList(buildPageSql(sql,pageNum,pageSize),
				values);
		
		// page分页对象 pageNum当前页，count 总记录数,totalPageCount 总页数 result 分页的数据
		return new Page(pageNum, totalCount, totalPageCount, result);
	}

	/**
	 * 取得分页SQL
	 * @param _sql
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public String buildPageSql(String _sql, int pageNum, int pageSize) {

		String sql_str = null;

		String db_type = "1";
		if (db_type.equals("1")) {
			db_type = "mysql";
		} else {
			db_type = "oracle";
		}

		if (db_type.equals("mysql")) {
			sql_str = _sql + " LIMIT " + (pageNum - 1) * pageSize + "," + pageSize;
		} else {
			StringBuffer sql = new StringBuffer(
					"SELECT * FROM (SELECT t1.*,rownum sn1 FROM (");
			sql.append(_sql);
			sql.append(") t1) t2 WHERE t2.sn1 BETWEEN ");
			sql.append((pageNum - 1) * pageSize + 1);
			sql.append(" AND ");
			sql.append(pageNum * pageSize);
			sql_str = sql.toString();
		}

		return sql_str.toString();
	}

	/**
	 * 调用存储过程
	 */
	public void call(){
		this.getJdbcTemplate().execute(
                new CallableStatementCreator() {
                    public CallableStatement createCallableStatement(Connection con) throws SQLException {
                        String storedProc = "{call updatetractractcode(?, ?)}";// 调用的存储过程
                        CallableStatement cs = con.prepareCall(storedProc);
                        cs.setInt(1, 111);// 设置输入参数的值
                        cs.registerOutParameter(2, java.sql.Types.INTEGER);// 注册输出参数的类型
                        return cs;
                    }
                }, new CallableStatementCallback() {
                    public Object doInCallableStatement(CallableStatement cs) throws SQLException, DataAccessException {
                        cs.execute();
                        return cs.getString(2);// 获取输出参数的值
                }
            });
	}
}
