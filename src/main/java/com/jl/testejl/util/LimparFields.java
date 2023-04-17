/*
 */
package com.jl.testejl.util;

import java.awt.Component;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JViewport;

/**
 *
 * @author francisco
 */
public class LimparFields {

    public static void clean(JComponent component) {
        for (Component c : component.getComponents()) {
            if (c instanceof JTextField) {
                JTextField text = (JTextField) c;
                text.setText("");
            }

            if (c instanceof JScrollPane) {
                for (Component cp : ((JScrollPane) c).getComponents()) {
                    if (cp instanceof JViewport) {
                        for (Component cv : ((JViewport) cp).getComponents()) {
                            JTextArea area = (JTextArea) cv;
                            area.setText("");
                        }
                    }

                }
            }
        }

    }

}
