/**
 * @description 
 * @date 2016-9-7
 * @author hxg	
 */
package UTS;

import java.lang.reflect.Constructor;
import java.util.Arrays;

import junit.framework.TestCase;

public class Test3 extends TestCase {
	public void test1() throws Exception {
		long start, end;
		// User u=new User(1,"test");
		// FileOutputStream out=new FileOutputStream("G:/temp.java");
		// ObjectOutputStream oos=new ObjectOutputStream(out);
		// oos.writeObject(u);
		// oos.close();
		// FileInputStream in=new FileInputStream("G:/temp.java");
		// ObjectInputStream ois=new ObjectInputStream(in);
		// Object o=ois.readObject();
		// System.out.println(o);

		Class clazz = Test3.class.getClassLoader().loadClass(
				"com.utils.SingleTon");
		Constructor c = clazz.getDeclaredConstructor(null);
		// c.setAccessible(false);
		start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			Object en = c.newInstance(null);
			Object en1 = c.newInstance(null);
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
		c.setAccessible(true);
		start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			Object en = c.newInstance(null);
			Object en1 = c.newInstance(null);
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	public void test2() throws Exception {
		splitStr("滚吗a", 6);
	}

	private String splitStr(String des, int index) {
		byte bt[] = des.getBytes();
		String subStrx = new String(bt, 0, index);
		System.out.println("subStrx==" + subStrx);
		
		return null;
	}
}
