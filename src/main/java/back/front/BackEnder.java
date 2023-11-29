package back.front;

public class BackEnder extends Developer implements BackendAction {
    @Override
    public void back() {
        System.out.println("Backend working");
    }
}
