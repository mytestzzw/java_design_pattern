package pattern_simplefactory.no_use.myinterface.person.personimpl;

import pattern_simplefactory.no_use.myinterface.person.Person;

public class Student implements Person {

	@Override
	public void getJob() {
        System.out.println("I am student");
	}

}
