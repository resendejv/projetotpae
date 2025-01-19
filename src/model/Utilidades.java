package model;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author joao victor
 */
public class Utilidades {

    
    public void limpaTela(JPanel container) {
    Component components[] = container.getComponents();
    for (Component component : components) {
        if (component instanceof JTextField) {
            ((JTextField) component).setText(null);
        } else if (component instanceof JScrollPane) {
            Component view = ((JScrollPane) component).getViewport().getView();
            if (view instanceof JTextArea) {
                ((JTextArea) view).setText(null);
            } else if (view instanceof JTable) {
                ((DefaultTableModel) ((JTable) view).getModel()).setRowCount(0);
            }
        }
    }
}
    
    
}



