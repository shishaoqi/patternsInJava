package factoryMethod.demo0;

import factoryMethod.demo0.interfaces.Creator;
import factoryMethod.demo0.interfaces.Product;

public class ConcreteCreator extends Creator {
    protected Product factoryMethod() {
        // 重定义工厂方法，返回一个具体的 Product 对象
        return new ConcreteProduct();
    }
}
