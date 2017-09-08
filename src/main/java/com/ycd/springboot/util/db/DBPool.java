package com.ycd.springboot.util.db;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;

/**
 * 连接池工具类，获取数据库连接
 */
public class DBPool implements DataSource {
 
    
    private static DataSource datasource;

//    static {
//        ApplicationContext ctx=new ClassPathXmlApplicationContext("application.properties");
//        datasource = ((JdbcTemplate)ctx.getBean("jdbcTemplate")).getDataSource();
//    }
   
    //重写父类的getConnection()方法，返回数据库连接池中的一个connection对象，
    @Override
    public Connection getConnection() throws SQLException{
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datasyn?useUnicode=true&characterEncoding=utf-8&useSSL=false&useOldAliasMetadataBehavior=true",
					"ycd","111111");
//			con = DriverManager.getConnection("jdbc:mysql://10.15.0.189:3306/madb?useUnicode=true&characterEncoding=utf-8&useSSL=false&useOldAliasMetadataBehavior=true",
//					"ma","Maq1w2e3r4!");
		} catch (Exception e) {
		}
    	return con;
    }

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public java.util.logging.Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}