package factories;

import dialogos.Dialogo;
import dialogos.DialogoMac;

public class DialogMacFactory implements DialogFactory{
    @Override
    public Dialogo crearDialogo() {
        return new DialogoMac();
    }
}
