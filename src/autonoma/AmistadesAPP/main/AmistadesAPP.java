
package autonoma.AmistadesAPP.main;

import autonoma.AmistadesAPP.models.Amigo;
import autonoma.AmistadesAPP.views.AgregarAmigo;
import autonoma.AmistadesAPP.views.PaginaPrincipal;

/**
 *
 * @author PC-ASUS
 */
public class AmistadesAPP {

   
    public static void main(String[] args) {
        Amigo amigo = new Amigo(" ", " ", " ");
        PaginaPrincipal ventana = new PaginaPrincipal(amigo);
        ventana.setVisible(true);
    }
    
}
