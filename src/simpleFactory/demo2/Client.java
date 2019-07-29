package simpleFactory.demo2;

import simpleFactory.demo2.interfaces.Api;

public class Client {
    public static void main(String[] args) {
        //重要改变，没有 new Impl()了，取而代之 Factory.createApi()
        Api api = Factory.createApi();
        api.operation("正在使用简单工厂");
    }
}
