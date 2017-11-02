package pattern_simplefactory.use.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

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
    
    //可配置简单工厂
    private static Properties personTypes = new Properties();
    static {
    	InputStream is = PersonFactory.class.getResourceAsStream("/pattern_simplefactory/persontypes.properties");
    	try {
			personTypes.load(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }
    
    //可配置方法
    public static Person getPropertiesPerson(String personType) throws Exception{
    	Set<Object> keySet = personTypes.keySet();
    	System.out.println(personTypes.size());
    	System.out.println(personTypes.getProperty(personType)); 
    	for(Object o :keySet) {
    		System.out.println((String)o);
    		if(((String)o).equals(personType)){
    			return (Person)Class.forName(personTypes.getProperty(personType)).newInstance();
    		}
    	}
    	return null;
	}
}
