package factoryMethod.demo1.interfaces;

public interface ExportFileApi {
    /**
     * 导出内容为文件
     * @param data 示意：需要保存的数据
     * @return 是否导出成功
     */
    public boolean export(String data);
}