/*
 * MyEditor.java
 *
 * Created on July 16, 2007, 9:27 PM
 */

package org.myorg.myeditor;

import org.openide.explorer.ExplorerManager;
import org.openide.explorer.ExplorerUtils;
import org.openide.explorer.view.BeanTreeView;
import org.openide.windows.TopComponent;

/**
 *
 * @author  gw152771    
 */
public class MyEditor extends TopComponent implements ExplorerManager.Provider {

    private final ExplorerManager mgr = new ExplorerManager();

    /** Creates new form MyEditor */
    public MyEditor() {
        initComponents();
        associateLookup (ExplorerUtils.createLookup(mgr, getActionMap()));
        mgr.setRootContext(new MyNode());
    }

    public ExplorerManager getExplorerManager() {
        return mgr;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new BeanTreeView();

        setLayout(new java.awt.BorderLayout());
        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
