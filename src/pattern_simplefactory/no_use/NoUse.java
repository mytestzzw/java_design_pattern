package pattern_simplefactory.no_use;


import pattern_simplefactory.myinterface.person.Person;
import pattern_simplefactory.myinterface.person.personimpl.Student;
/*
 * ��ʹ�ù�����ȡʵ��
 * 
 * ȱ��
 * 1.���������ʵ�������һ��
 * */
public class NoUse {

	public static void main(String[] args) {
        //��ʹ�ù�����ȡʵ����ʽ1
		Student s0 = new Student();
		//��ʹ�ù�����ȡʵ����ʽ2
		Person p0 = new Student();
	}

}
