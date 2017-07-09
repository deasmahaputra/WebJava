
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Combobox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEAS
 */
public class Controller extends GenericForwardComposer{
    private Combobox cmb;

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp); //To change body of generated methods, choose Tools | Templates.
        alert("Test dengan Controller");
        for(int i = 0; i < 2; i++){
            cmb.appendItem("Item" + i);
        }
    }
    
}
