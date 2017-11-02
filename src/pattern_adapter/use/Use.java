package pattern_adapter.use;

import java.util.ArrayList;
import java.util.List;

import pattern_adapter.myinterface.DBOperater;
import pattern_adapter.myinterface.FileOperater;
import pattern_adapter.myinterface.LogModel;
import pattern_adapter.myinterface.impl.Adapter;
import pattern_adapter.myinterface.impl.MyFlieOperater;

public class Use {

	public static void main(String[] args) {
        LogModel log = new LogModel();
        log.setId("001");
        log.setDate("20171102");
        log.setContent("天气不错");
        
        List<LogModel> logs = new ArrayList<>();
        logs.add(log);
        FileOperater fo = new MyFlieOperater();
        fo.writeFileLog(logs);
        System.out.println(fo.readFileLog().get(0).toString());
        
        //使用适配器适配
        LogModel log1 = new LogModel();
        log1.setId("002");
        log1.setDate("201711");
        log1.setContent("天气");
        DBOperater adapter = new Adapter(fo);
        adapter.createLog(log1);
        System.out.println(adapter.getLog().get(0));
        
        
	}

}
