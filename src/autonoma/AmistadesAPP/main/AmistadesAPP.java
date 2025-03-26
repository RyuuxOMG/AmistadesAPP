
package autonoma.AmistadesAPP.main;

import autonoma.AmistadesAPP.models.Amigo;
import autonoma.AmistadesAPP.views.AgregarAmigo;
import autonoma.AmistadesAPP.views.PaginaPrincipal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC-ASUS
 */
public class AmistadesAPP {

   
    public static void main(String[] args) {
        Amigo amigo = new Amigo(" ", " ", " ");
        List<Amigo> listaAmigos = new ArrayList<>();
        PaginaPrincipal ventana = new PaginaPrincipal(amigo,listaAmigos);
        ventana.setVisible(true);
    }
    
}
