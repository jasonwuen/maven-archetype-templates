/**
 *
 *  Copyright (c) 2013-2023 by wujun.net.cn. All rights reserved.
 *
 */
package cn.net.wujun.maven.archetypes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * App.
 *
 * @author <a href="mailto:jason.wu.en@gmail.com">Jason Wu</a>
 * @version 0.0.1, 2014-05-21 16:27
 */
public class App {

	/** slf4j logger instance. */
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * say.
	 *
	 * @param name
	 */
	public String say(String name) {
		logger.debug("{} hello!", name);
		return name + " hello!";
	}

	public static void main(String[] args) {
		App app = new App();
		System.out.println(app.say("Jason"));
	}
}