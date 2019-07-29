package simpleFactory.demo1;

import simpleFactory.demo1.interfaces.Api;

public class Client {
    public static void main(String[] args) {
        //重要改变，没有 new Impl()了，取而代之 Factory.createApi()
        Api api = Factory.createApi(1);
        api.operation("正在使用简单工厂");
    }
}
