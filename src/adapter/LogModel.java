package adapter;

/**
 * 日志数据对象
 */
public class LogModel {
    /**
     * 日志编号
     */
    private String logId;

    /**
     * 操作人员
     */
    private  String operateUser;

    /**
     * 操作时间，以yyyy-MM-dd HH:mm:ss 的格式记录
     */
    private String getOperateTime;

    /**
     * 日志内容
     */
    private String logContent;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser;
    }

    public String getGetOperateTime() {
        return getOperateTime;
    }

    public void setGetOperateTime(String getOperateTime) {
        this.getOperateTime = getOperateTime;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    public String toString() {
        return "logId="+logId+",operateUser="+operateUser
                +",operateTime="+operateTime+",logContent="+logContent;
    }
}
