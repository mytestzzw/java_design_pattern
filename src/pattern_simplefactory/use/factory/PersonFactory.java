package pattern_simplefactory.use.factory;

import pattern_simplefactory.myinterface.person.Person;
import pattern_simplefactory.myinterface.person.personimpl.Student;

public class PersonFactory {
	//私有化构造方法，不用创建工厂实例
    private PersonFactory() {}
    
    public static Person getPerson(String personType) {
		if("student".equals(personType)) {
			return new Student();
		}else {
			return null;
		}
	}
}
