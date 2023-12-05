package back.front;

public class FullstackDeveloper extends FrontEnder implements BackEnder {
    private String name;
    private String backTechnology;
    private String frontTechnology;

    public FullstackDeveloper(String name, String backTechnology, String frontTechnology) {
        this.name = name;
        this.backTechnology = backTechnology;
        this.frontTechnology = frontTechnology;
    }

    public String getName() {
        return name;
    }

    public String getBackTechnology() {
        return backTechnology;
    }

    public String getFrontTechnology() {
        return frontTechnology;
    }

    @Override
    public void developBackend() {
        System.out.println("Fullstack developer " + name + " develops backend on " + backTechnology);
    }

    @Override
    public void developGUI() {
        System.out.println("Fullstack developer " + name + " develops frontend on " + frontTechnology);
    }
}
