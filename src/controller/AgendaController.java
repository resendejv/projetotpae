/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Utilidades;
import view.Agenda;

/**
 * Classe responsável por gerenciar a janela de agenda.
 *
 * @author joao victor
 */
public class AgendaController implements Utilidades {
    

    public AgendaController(Agenda view) {
    }

    /**
     * Método implementado que limpa a os campos de texto quando as informações
     * são salvas.
     * 
     * @param container Janela da agenda
     */
    @Override
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
    
