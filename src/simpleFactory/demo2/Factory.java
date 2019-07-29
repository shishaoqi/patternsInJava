package simpleFactory.demo2;

import simpleFactory.demo2.interfaces.Api;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Factory {
    /**
     * 具体创建 Api 的方法，根据配置的参数来创建接口
     * @return 创建好的 Api 对象
     */
    public static Api createApi() {
        Properties p = new Properties();
        InputStream in = null;
        try {
            in = Factory.class.getResourceAsStream(
                    "FactoryTest.properties"
            );
            p.load(in);
        } catch (IOException e) {
            System.out.println("装载工厂配置文件出错了，具体的堆栈信息如下：");
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Api api = null;
        try {
            api = (Api)Class.forName(p.getProperty("ImplClass")).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return api;
    }
}
