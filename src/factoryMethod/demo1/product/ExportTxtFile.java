package factoryMethod.demo1.product;

import factoryMethod.demo1.interfaces.ExportFileApi;

public class ExportTxtFile implements ExportFileApi {
    public boolean export(String data) {
        System.out.println("导出数据" + data + "到文本文件");
        return true;
    }
}