package pattern_adapter.myinterface;

import java.util.List;

public interface DBOperater {
    void createLog(LogModel log);
    List<LogModel> getLog();
}
