package factoryMethod.demo1.creator;

import factoryMethod.demo1.product.ExportTxtFile;
import factoryMethod.demo1.interfaces.ExportFileApi;
import factoryMethod.demo1.interfaces.ExportOperate;

public class ExportTxtFileOperate extends ExportOperate {
    protected ExportFileApi factoryMethod() {
        // 创建导出成文本格式的对象
        return new ExportTxtFile();
    }
}
