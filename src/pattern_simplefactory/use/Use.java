package pattern_simplefactory.use;

import pattern_simplefactory.myinterface.person.Person;
import pattern_simplefactory.use.factory.PersonFactory;

/*
 * ʹ�ü򵥹���ģʽ
 * 
 * �ŵ㣺
 * 1.���ٳ���Studentʵ����
 * */
public class Use {
	
    public static void main (String[] args) {
		Person p0 = PersonFactory.getPerson("student");
		p0.getJob();
	}
    
}
