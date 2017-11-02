package pattern_facade.use;

import pattern_facade.myinterface.ModuleA;
import pattern_facade.myinterface.ModuleB;
import pattern_facade.myinterface.ModuleC;
import pattern_facade.myinterface.impl.MyModuleA;
import pattern_facade.myinterface.impl.MyModuleB;
import pattern_facade.myinterface.impl.MyModuleC;

public class Facade {
        public static void test() {
        	 ModuleA a = new MyModuleA();
             ModuleB b = new MyModuleB();
             ModuleC c = new MyModuleC();
             a.test();
             b.test();
             c.test();
		}
}
