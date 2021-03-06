/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jme3.gde.gui.services.niftygui.nodes.factory;

import com.jme3.gde.gui.services.niftygui.NiftyGUI;
import com.jme3.gde.gui.base.model.elements.GElement;
import com.jme3.gde.gui.services.niftygui.nodes.NiftyControlDefNode;
import com.jme3.gde.gui.services.niftygui.nodes.NiftyControlNode;
import com.jme3.gde.gui.services.niftygui.nodes.NiftyElementNode;
import com.jme3.gde.gui.services.niftygui.nodes.NiftyLayerNode;
import com.jme3.gde.gui.services.niftygui.nodes.NiftyScreenNode;
import com.jme3.gde.gui.services.niftygui.nodes.NiftyStyleRefNode;
import java.util.List;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;

/**
 *
 * @author cuong.nguyenmanh2
 */
public class DocChildrenFactory extends ChildFactory<GElement> {
    private NiftyGUI docModel;

    public DocChildrenFactory(NiftyGUI docModel) {
        this.docModel = docModel;
    }

    @Override
    protected boolean createKeys(List<GElement> toPopulate) {
        toPopulate.addAll(docModel.getScreens());
        return true;
    }
    
    protected Node createNodeForKey(GElement gTreeNode) {
        String nodeName = gTreeNode.getType().toString();
        if (nodeName.equals("useStyles")) {
            return new NiftyStyleRefNode(gTreeNode);
        } else if (nodeName.equals("useControls")) {
            return new NiftyControlDefNode(gTreeNode);
        } else if (nodeName.equals("useControls")) {
            return new AbstractNode(Children.LEAF);
        } else if (nodeName.equals("screen")) {
            return new NiftyScreenNode(gTreeNode);
        } else if (nodeName.equals("layer")) {
            return new NiftyLayerNode(gTreeNode);
        } else if (nodeName.equals("control") || nodeName.equals("text")) {
            return new NiftyControlNode(gTreeNode);
        } else {
            return new NiftyElementNode(gTreeNode);
        }
    }
    
    public void heavyRefresh(){
        refresh(true);
    }
}
