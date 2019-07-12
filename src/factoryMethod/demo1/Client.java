package factoryMethod.demo1;

import factoryMethod.demo1.creator.ExportDBOperate;
import factoryMethod.demo1.interfaces.ExportOperate;

public class Client {
    public static void main(String[] args) {
        ExportOperate operate = new ExportDBOperate();
        operate.export("\"DB测试数据\"");
    }
}
