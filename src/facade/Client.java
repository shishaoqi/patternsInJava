package facade;

import simpleFactory.demo2.Factory;

public class Client {
    public static void main(String[] args) {
        /*new Presentation().generate();
        new Business().generate();
        new DAO().generate();*/

        new Facade().generate();
    }
}
