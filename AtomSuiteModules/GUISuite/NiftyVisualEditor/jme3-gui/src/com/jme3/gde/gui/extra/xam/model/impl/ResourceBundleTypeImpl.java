/*
 
 */
package com.jme3.gde.gui.extra.xam.model.impl;

import com.jme3.gde.gui.extra.xam.model.NiftyAttribute;
import org.w3c.dom.Element;
import com.jme3.gde.gui.extra.xam.model.NiftyModel;
import com.jme3.gde.gui.extra.xam.model.NiftyQName;
import com.jme3.gde.gui.extra.xam.model.ResourceBundleType;
import com.jme3.gde.gui.extra.xam.model.spi.NiftyComponentBase;
import com.jme3.gde.gui.extra.xam.model.visitor.NiftyComponentVisitor;	

/**
 * Implementation for domain component resourceBundleType.
 * 
 * @author cuongnguyen
 */
// Generated by XAM AutoGen Tool v0.2
public class ResourceBundleTypeImpl extends NiftyComponentBase implements ResourceBundleType {

    public ResourceBundleTypeImpl(NiftyModel model, Element element) {
        super(model, element);
    }
    
    public ResourceBundleTypeImpl(NiftyModel model) {
        this(model, createElementNS(model, NiftyQName.RESOURCEBUNDLETYPE));
    }

    // attributes

    public String getId() {
        return getAttribute(NiftyAttribute.ID);
    }

    public void setId(String id) {
        setAttribute(ID_PROPERTY, NiftyAttribute.ID, id);
    }

    public String getFilename() {
        return getAttribute(NiftyAttribute.FILENAME);
    }

    public void setFilename(String filename) {
        setAttribute(FILENAME_PROPERTY, NiftyAttribute.FILENAME, filename);
    }

    // child elements

    public void accept(NiftyComponentVisitor visitor) {
        visitor.visit(this);
    }

}