package pattern_adapter.myinterface;

import java.util.List;

public interface FileOperater {
    List<LogModel> readFileLog();
    void writeFileLog(List<LogModel> list);
}
