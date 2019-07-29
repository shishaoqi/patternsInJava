package simpleFactory.demo1;

import simpleFactory.demo1.interfaces.Api;

public class ImplB implements Api {
    public void operation(String s) {
        // 实现功能的代码，示意一下
        System.out.println("ImplB S==" + s);
    }
}
