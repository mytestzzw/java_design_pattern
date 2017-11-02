package pattern_facade.no_use;

import pattern_facade.myinterface.ModuleA;
import pattern_facade.myinterface.ModuleB;
import pattern_facade.myinterface.ModuleC;
import pattern_facade.myinterface.impl.MyModuleA;
import pattern_facade.myinterface.impl.MyModuleB;
import pattern_facade.myinterface.impl.MyModuleC;

public class NoUse {

	public static void main(String[] args) {
        ModuleA a = new MyModuleA();
        ModuleB b = new MyModuleB();
        ModuleC c = new MyModuleC();
        a.test();
        b.test();
        c.test();
	}

}
