/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectocompilador;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author mach5
 */
public class ProyectoCompilador {

    public static void main(String[] args) {
        setupUI();
        new Menu().setVisible(true);
    }
    
    private static void setupUI() {
        // Configuración de la apariencia de la interfaz
        try {
            // Aplicar el tema oscuro para macOS
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
            UIManager.put("defaultFont", new java.awt.Font(FlatRobotoFont.FAMILY, java.awt.Font.PLAIN, 13));
            
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
}
