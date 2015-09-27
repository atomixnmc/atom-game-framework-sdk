/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.gde.spriteeditor;

import dfEditor.SpritesheetController;
import dfEditor.command.CommandManager;
import dfEditor.dfEditorTask;
import dfEditor.events.TaskChangeListener;
import dfEditor.io.SpritesheetReader;
import javax.swing.tree.DefaultTreeModel;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.filesystems.FileUtil;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;
import sg.gde.spriteeditor.io.file.sprite.SpriteFileDataObject;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//sg.gde.spriteeditor//SpriteEditor//EN",
        autostore = false)
@TopComponent.Description(
        preferredID = "SpriteEditorTopComponent",
        iconBase = "sg/gde/spriteeditor/resources/images/icons/app/appIcon.png",
        persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "editor", openAtStartup = false)
@ActionID(category = "Window", id = "sg.gde.spriteeditor.SpriteEditorTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_SpriteEditorAction",
        preferredID = "SpriteEditorTopComponent")
@Messages({
    "CTL_SpriteEditorAction=SpriteEditor",
    "CTL_SpriteEditorTopComponent=SpriteEditor Window",
    "HINT_SpriteEditorTopComponent=This is a SpriteEditor window"
})
public final class SpriteEditorTopComponent extends TopComponent{

    

    public SpriteEditorTopComponent() {
        initComponents();
        setName(Bundle.CTL_SpriteEditorTopComponent());
        setToolTipText(Bundle.HINT_SpriteEditorTopComponent());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainToolbar = new javax.swing.JToolBar();
        btnAdd = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        mainToolbar.setRollover(true);

        org.openide.awt.Mnemonics.setLocalizedText(btnAdd, org.openide.util.NbBundle.getMessage(SpriteEditorTopComponent.class, "SpriteEditorTopComponent.btnAdd.text")); // NOI18N
        btnAdd.setFocusable(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainToolbar.add(btnAdd);

        org.openide.awt.Mnemonics.setLocalizedText(lblStatus, org.openide.util.NbBundle.getMessage(SpriteEditorTopComponent.class, "SpriteEditorTopComponent.lblStatus.text")); // NOI18N
        mainToolbar.add(lblStatus);

        add(mainToolbar, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 899, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );

        add(contentPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JToolBar mainToolbar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }

}