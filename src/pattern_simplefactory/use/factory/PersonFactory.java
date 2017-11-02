package pattern_simplefactory.use.factory;

import pattern_simplefactory.myinterface.person.Person;
import pattern_simplefactory.myinterface.person.personimpl.Student;

public class PersonFactory {
	//˽�л����췽�������ô�������ʵ��
    private PersonFactory() {}
    
    public static Person getPerson(String personType) {
		if("student".equals(personType)) {
			return new Student();
		}else {
			return null;
		}
	}
}
