package pattern_simplefactory.use;

import pattern_simplefactory.myinterface.person.Person;
import pattern_simplefactory.use.factory.PersonFactory;

/*
 * 使用简单工厂模式
 * 
 * 优点：
 * 1.不再出现Student实现类
 * */
public class Use {
	
    public static void main (String[] args) {
		Person p0 = PersonFactory.getPerson("student");
		p0.getJob();
		
		//可配置简单工厂
		try {
			Person p1 = PersonFactory.getPropertiesPerson("Teacher");
			p1.getJob();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    
}
