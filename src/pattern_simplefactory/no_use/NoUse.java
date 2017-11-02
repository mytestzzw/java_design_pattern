package pattern_simplefactory.no_use;


import pattern_simplefactory.myinterface.person.Person;
import pattern_simplefactory.myinterface.person.personimpl.Student;
/*
 * 不使用工厂获取实例
 * 
 * 缺点
 * 1.调用与具体实现类耦合一起
 * */
public class NoUse {

	public static void main(String[] args) {
        //不使用工厂获取实例方式1
		Student s0 = new Student();
		//不使用工厂获取实例方式2
		Person p0 = new Student();
	}

}
