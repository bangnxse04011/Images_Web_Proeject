package com.images.sex.entity.db;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.io.IOUtils;

import com.images.sex.entity.helper.LoggerFile;

public class MysqlDataSource {
	
	private static 			MysqlDataSource 	mysqlDataSource 	= null;
	private static final 	String 				PATHPROPS 			= "/conf/config.properties";
	
	public static MysqlDataSource getInstance() {
		if(mysqlDataSource == null) {
			mysqlDataSource = new MysqlDataSource();
		}
		return mysqlDataSource;
	}
	
	/**
	 * Method create connection to database
	 * 
	 * @return
	 */
	public Connection getConnect() {
		Connection conn = null;
		Properties prop = new Properties();
		InputStream is = null;
		try {
			is = MysqlDataSource.class.getResourceAsStream(PATHPROPS);
			prop.load(is);
			IOUtils.closeQuietly(is);
		} catch (Exception e) {
			Logger lg = Logger.getLogger(MysqlDataSource.class.getName(), null);
			lg.log(Level.SEVERE, e.getMessage(), e);
		} finally {
			IOUtils.closeQuietly(is);
		}

		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		String dbName = prop.getProperty("dbname");
		try {
			String connectionURL = url;
			Class.forName(driver);
			if (dbName != null) {
				connectionURL = url + dbName;
			}
			conn = DriverManager.getConnection(connectionURL, username,
					password);
		} catch (Exception e) {
			LoggerFile.logger(e, MysqlDataSource.class.getName());
		}
		return conn;
	}
	
	public static void main(String agrs []) {
		System.out.println(MysqlDataSource.getInstance().getConnect());
	}
}
