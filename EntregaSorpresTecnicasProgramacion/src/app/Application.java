package app;

import dialogos.Dialogo;
import factories.DialogFactory;

public class Application {
    private Dialogo dial1;

    public Application(DialogFactory factory){
        dial1 = factory.crearDialogo();
    }

    public void paint(){
        dial1.mostrarDialogo();
    }
}
