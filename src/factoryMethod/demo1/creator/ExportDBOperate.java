package factoryMethod.demo1.creator;

import factoryMethod.demo1.product.ExportDB;
import factoryMethod.demo1.interfaces.ExportFileApi;
import factoryMethod.demo1.interfaces.ExportOperate;

public class ExportDBOperate extends ExportOperate {
    protected ExportFileApi factoryMethod() {
        return new ExportDB();
    }
}
