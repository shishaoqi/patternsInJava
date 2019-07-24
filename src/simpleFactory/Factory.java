package simpleFactory;

import simpleFactory.interfaces.Api;

public class Factory {
    public static Api createApi(int condition) {
        Api api = null;
        if(condition == 1){
            api = new ImplA();
        }else if(condition == 2) {
             api = new ImplB();
        }

        return api;
    }
}
