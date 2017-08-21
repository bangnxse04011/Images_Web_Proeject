package com.images.sex.entity.helper;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerFile {
	
	private LoggerFile() {
		super();
	}

	/**
	 * Method get log from class
	 * @param e : exception
	 * @param className : class have exception
	 */
	public static void logger(Exception e, String className) {
		Logger lg = Logger.getLogger(className);
		lg.log(Level.SEVERE, e.getMessage(), e);
	}
}
