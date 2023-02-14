import app.Application;
import factories.DialogFactory;
import factories.DialogMacFactory;
import factories.DialogWindowsFactory;

public class Main {
    private static Application configureApplication() {
        Application app;
        DialogFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new DialogMacFactory();
            factory.crearDialogo();
        } else {
            factory = new DialogWindowsFactory();
            factory.crearDialogo();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
