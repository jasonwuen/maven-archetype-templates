/**
 *
 *  Copyright (c) 2013-2023 by wujun.net.cn. All rights reserved.
 *
 */
package cn.net.wujun.maven.archetypes;

import org.junit.Assert;
import org.junit.Test;

/**
 * AppTest.
 *
 * @author <a href="mailto:jason.wu.en@gmail.com">Jason Wu</a>
 * @version 0.0.1, 2014-05-21 16:27
 */
public class AppTest {

	@Test
	public void say() {
		App app = new App();
		Assert.assertEquals("Jason hello!", app.say("Jason"));
	}

}