/**
 * @description 
 * @date 2016-9-6
 * @author hxg	
 */
package UTS;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.User;

public class Test2  {
	public static void main(String[] args) {
		BeanFactory context = new ClassPathXmlApplicationContext(
				"spring-hibernate.xml");
		SessionFactory session=(SessionFactory) context.getBean("sessionFactory");
		Session s=session.openSession();
		System.out.println(session.openSession());
		User u=session.openSession().get(User.class, 1);
		System.out.println(u);
	}
}
