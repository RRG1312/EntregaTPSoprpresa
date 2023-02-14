package factories;

import dialogos.Dialogo;
import dialogos.DialogoWindows;

public class DialogWindowsFactory implements DialogFactory{
    @Override
    public Dialogo crearDialogo() {
        return new DialogoWindows();
    }
}
