package adapter;

import adapter.interfaces.LogFileOperateApi;

import java.util.List;

public class LogFileOperate implements LogFileOperateApi {
    private String logFilePathName = "AdapterLog.log";

    public LogFileOperate(String logFilePathName) {
        if(logFilePathName != null &&
            logFilePathName.trim().length()>0){
            this.logFilePathName = logFilePathName;
        }
    }

    public List<LogModel> readLogFile() {

        try {

        } catch (Exception e) {

        } finally {

        }
        return null;
    }

    public void writeLogFile(List<LogModel> list) {

        try {

        } catch (Exception e) {

        } finally {

        }
    }
}
