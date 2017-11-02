package pattern_adapter.myinterface.impl;

import java.util.ArrayList;
import java.util.List;

import pattern_adapter.myinterface.DBOperater;
import pattern_adapter.myinterface.FileOperater;
import pattern_adapter.myinterface.LogModel;

public class Adapter implements DBOperater {

	private FileOperater fo;
	
	
	
	public Adapter(FileOperater fo) {
		super();
		this.fo = fo;
	}

	@Override
	public void createLog(LogModel log) {
		List<LogModel> list = new ArrayList<>();
		list.add(log);
		fo.writeFileLog(list);

	}

	@Override
	public List<LogModel> getLog() {
		
		return fo.readFileLog();
	}

}
