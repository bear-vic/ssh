/**
 * @description 
 * @date 2016-9-7
 * @author hxg	
 */
package UTS;

import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import com.entity.User;

public class UTest2 extends TestCase {
	public void test() throws CloneNotSupportedException {
		Set s = new HashSet();
		User u = null;
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			u = new User(1, "xx");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		start = System.currentTimeMillis();
		User b=null;
		for (int i = 0; i < 100; i++) {
			b = (User) u.clone();
		}
		System.out.println(b);
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
