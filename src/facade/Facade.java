package facade;

/**
 * 外观对象
 */
public class Facade {
    public void generate(){
        new Presentation().generate();
        new Business().generate();
        new DAO().generate();
    }
}
