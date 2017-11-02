package pattern_simplefactory.myinterface.person.personimpl;

import pattern_simplefactory.myinterface.person.Person;

public class Teacher implements Person{

	@Override
	public void getJob() {
        System.out.println("I am teacher");		
	}

}
