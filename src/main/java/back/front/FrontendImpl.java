package back.front;

public class FrontendImpl extends FrontEnder implements Developer {
    private String name;
    private String frontTechnology;

    public FrontendImpl(String name, String frontTechnology) {
        this.name = name;
        this.frontTechnology = frontTechnology;
    }

    @Override
    public String getName() {
        return name;
    }


    public String getFrontTechnology() {
        return frontTechnology;
    }


    @Override
    public void developGUI() {
        System.out.println("Developer " + name + " develops frontend on " + frontTechnology);
    }
}
