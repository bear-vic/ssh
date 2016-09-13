/**
 * @description 
 * @date 2016-8-27
 * @author hxg	
 */
package UTS;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import junit.framework.TestCase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UTest extends TestCase {
	private final static Logger logger = LoggerFactory
			.getLogger(TestCase.class);

	public void test1() {
		logger.info("logback 成功了");
		// logger.error("logback 成功了");
	}

	public static void test2(String i) {
		System.out.println(i + "");
	}

	public static void main(String[] args) {
		test2(null);
	}

	public void test3() {
		double d = 3.2285;
		NumberFormat f = new DecimalFormat("#0.00"); 
	}
}
