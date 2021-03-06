/*
 
 */
package com.jme3.gde.gui.extra.xam.model.impl;

import com.jme3.gde.gui.extra.xam.model.NiftyAttribute;
import org.w3c.dom.Element;
import com.jme3.gde.gui.extra.xam.model.NiftyModel;
import com.jme3.gde.gui.extra.xam.model.NiftyQName;
import com.jme3.gde.gui.extra.xam.model.OnHoverType;
import com.jme3.gde.gui.extra.xam.model.spi.NiftyComponentBase;
import com.jme3.gde.gui.extra.xam.model.visitor.NiftyComponentVisitor;	

/**
 * Implementation for domain component onHoverType.
 * 
 * @author cuongnguyen
 */
// Generated by XAM AutoGen Tool v0.2
public class OnHoverTypeImpl extends NiftyComponentBase implements OnHoverType {

    public OnHoverTypeImpl(NiftyModel model, Element element) {
        super(model, element);
    }
    
    public OnHoverTypeImpl(NiftyModel model) {
        this(model, createElementNS(model, NiftyQName.ONHOVERTYPE));
    }

    // attributes

    public String getHoverFalloffType() {
        return getAttribute(NiftyAttribute.HOVERFALLOFFTYPE);
    }

    public void setHoverFalloffType(String hoverFalloffType) {
        setAttribute(HOVERFALLOFFTYPE_PROPERTY, NiftyAttribute.HOVERFALLOFFTYPE, hoverFalloffType);
    }

    public String getHoverFalloffConstraint() {
        return getAttribute(NiftyAttribute.HOVERFALLOFFCONSTRAINT);
    }

    public void setHoverFalloffConstraint(String hoverFalloffConstraint) {
        setAttribute(HOVERFALLOFFCONSTRAINT_PROPERTY, NiftyAttribute.HOVERFALLOFFCONSTRAINT, hoverFalloffConstraint);
    }

    public String getHoverWidth() {
        return getAttribute(NiftyAttribute.HOVERWIDTH);
    }

    public void setHoverWidth(String hoverWidth) {
        setAttribute(HOVERWIDTH_PROPERTY, NiftyAttribute.HOVERWIDTH, hoverWidth);
    }

    public String getHoverHeight() {
        return getAttribute(NiftyAttribute.HOVERHEIGHT);
    }

    public void setHoverHeight(String hoverHeight) {
        setAttribute(HOVERHEIGHT_PROPERTY, NiftyAttribute.HOVERHEIGHT, hoverHeight);
    }

    // child elements

    public void accept(NiftyComponentVisitor visitor) {
        visitor.visit(this);
    }

}