package factoryMethod.demo0.interfaces;

public abstract class Creator {
    /**
     * 创建 Product 的工厂方法
     * @return Product 对象
     */
    protected  abstract Product factoryMethod();

    /**
     * 示意方法，实现某些功能的方法
     */
    public void someOperation() {
        // 通常在这些方法实现中， 需要调用工厂方法来获取 Product 对象
        Product product = factoryMethod();
    }
}
