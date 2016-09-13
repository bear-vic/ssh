/**
 * @description 
 * @date 2016-9-7
 * @author hxg	
 */
package UTS;

public class T1 {
	public T1() {
		System.out.println("t1");
	}

	public T1(int o) {
		System.out.println("t1 o");
	}

	public static void main(String[] ars) {
		B ab = new B(); // 执行到此处,结果: 1a2b
		//ab = new B(); // 执行到此处,结果: 1a2b2b
	}

}

class A {
	static T1 t=new T1(); 
	static {
		System.out.print("1");
	}
	public static void test(){
		System.out.println("test");
	}
	public A() {
		System.out.print("2");
	}
}

class B extends A {
	static T1 t=new T1(); 
	static {
		System.out.print("a");
	}

	public B() {
		System.out.print("b");
	}
}
