package adapter.interfaces;

import adapter.LogModel;

import java.util.List;

public interface LogFileOperateApi {
    /**
     * 读取日志文件，从文件里面获取存储的日志列表对象
     */
    public List<LogModel> readLogFile();

    /**
     * 写日志文件，把日志列表写出到日志文件中去
     */
    public void writeLogFile(List<LogModel> list);
}
