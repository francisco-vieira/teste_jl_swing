/*
 */
package com.jl.testejl.util;

import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author francisco
 */
public class InternalFrameController {

    public static void internalFrame(JInternalFrame frame, JDesktopPane desktopPane) {
        Dimension d = desktopPane.getSize();
        frame.setLocation((d.width - frame.getWidth()) / 2, (d.height - frame.getHeight()) / 2);
        for (JInternalFrame f : desktopPane.getAllFrames()) {

            if (f.getClass().equals(frame.getClass())) {
                if (f.isIcon()) {
                    try {
                        f.setIcon(false);
                        f.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(InternalFrameController.class.getName())
                                .log(Level.SEVERE, "Error print InternalFrame");
                    }
                }
                f.toFront();
                return;
            }
        }
        desktopPane.add(frame);
        frame.setVisible(true);
    }

}
