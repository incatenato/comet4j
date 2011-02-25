package org.comet4j.core.test;

import org.comet4j.core.CometContext;

/**
 * 模拟发送信息的测试类
 * @author xiaojinghai
 * @date 2011-2-24
 */

public class SendMessageTest implements Runnable {

	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			CometContext.getInstance().getEngine().sendTo(CometContext.getInstance().getEngine().getConnections(),
					"Test Data");

		}
	}
}