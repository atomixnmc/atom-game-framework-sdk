/*
 
 */
package com.jme3.gde.gui.extra.xam.model;

import java.util.List;
import org.w3c.dom.Element;
import com.jme3.gde.gui.extra.xam.model.AlignType;
import com.jme3.gde.gui.extra.xam.model.EffectsType;
import com.jme3.gde.gui.extra.xam.model.ElementType;
import com.jme3.gde.gui.extra.xam.model.InteractType;
import com.jme3.gde.gui.extra.xam.model.LayoutType;
import com.jme3.gde.gui.extra.xam.model.NiftyModel;
import com.jme3.gde.gui.extra.xam.model.NiftyQName;
import com.jme3.gde.gui.extra.xam.model.ValignType;
import com.jme3.gde.gui.extra.xam.model.spi.NiftyComponentBase;
import com.jme3.gde.gui.extra.xam.model.visitor.NiftyComponentVisitor;	

/**
 * Implementation for domain component elementType.
 * 
 * @author cuongnguyen
 */
// Generated by XAM AutoGen Tool v0.2
public class ElementTypeImpl extends NiftyComponentBase implements ElementType {

    public ElementTypeImpl(NiftyModel model, Element element) {
        super(model, element);
    }
    
    public ElementTypeImpl(NiftyModel model) {
        this(model, createElementNS(model, NiftyQName.ELEMENTTYPE));
    }

    // attributes

    public String getId() {
        return getAttribute(NiftyAttribute.ID);
    }

    public void setId(String id) {
        setAttribute(ID_PROPERTY, NiftyAttribute.ID, id);
    }

    public String getWidth() {
        return getAttribute(NiftyAttribute.WIDTH);
    }

    public void setWidth(String width) {
        setAttribute(WIDTH_PROPERTY, NiftyAttribute.WIDTH, width);
    }

    public String getHeight() {
        return getAttribute(NiftyAttribute.HEIGHT);
    }

    public void setHeight(String height) {
        setAttribute(HEIGHT_PROPERTY, NiftyAttribute.HEIGHT, height);
    }

    public AlignType getAlign() {
        return AlignType.getAlignType(getAttribute(NiftyAttribute.ALIGN));
    }

    public void setAlign(AlignType align) {
        setAttribute(ALIGN_PROPERTY, NiftyAttribute.ALIGN, align.getValue());
    }

    public ValignType getValign() {
        return ValignType.getValignType(getAttribute(NiftyAttribute.VALIGN));
    }

    public void setValign(ValignType valign) {
        setAttribute(VALIGN_PROPERTY, NiftyAttribute.VALIGN, valign.getValue());
    }

    public LayoutType getChildLayout() {
        return LayoutType.getLayoutType(getAttribute(NiftyAttribute.CHILDLAYOUT));
    }

    public void setChildLayout(LayoutType childLayout) {
        setAttribute(CHILDLAYOUT_PROPERTY, NiftyAttribute.CHILDLAYOUT, childLayout.getValue());
    }

    public boolean isChildClip() {
        return Boolean.parseBoolean(getAttribute(NiftyAttribute.CHILDCLIP));
    }

    public void setChildClip(boolean childClip) {
        setAttribute(CHILDCLIP_PROPERTY, NiftyAttribute.CHILDCLIP, childClip);
    }

    public String getBackgroundImage() {
        return getAttribute(NiftyAttribute.BACKGROUNDIMAGE);
    }

    public void setBackgroundImage(String backgroundImage) {
        setAttribute(BACKGROUNDIMAGE_PROPERTY, NiftyAttribute.BACKGROUNDIMAGE, backgroundImage);
    }

    public String getBackgroundColor() {
        return getAttribute(NiftyAttribute.BACKGROUNDCOLOR);
    }

    public void setBackgroundColor(String backgroundColor) {
        setAttribute(BACKGROUNDCOLOR_PROPERTY, NiftyAttribute.BACKGROUNDCOLOR, backgroundColor);
    }

    public boolean isVisibleToMouse() {
        return Boolean.parseBoolean(getAttribute(NiftyAttribute.VISIBLETOMOUSE));
    }

    public void setVisibleToMouse(boolean visibleToMouse) {
        setAttribute(VISIBLETOMOUSE_PROPERTY, NiftyAttribute.VISIBLETOMOUSE, visibleToMouse);
    }

    public String getStyle() {
        return getAttribute(NiftyAttribute.STYLE);
    }

    public void setStyle(String style) {
        setAttribute(STYLE_PROPERTY, NiftyAttribute.STYLE, style);
    }

    // child elements

    public List<InteractType> getInteractTypes() {
        return getChildren(InteractType.class);
    }

    public void addInteractType(InteractType interactType) {
        appendChild(INTERACTTYPE_PROPERTY, interactType);
    }

    public void removeInteractType(InteractType interactType) {
        removeChild(INTERACTTYPE_PROPERTY, interactType);
    }

    public List<EffectsType> getEffectsTypes() {
        return getChildren(EffectsType.class);
    }

    public void addEffectsType(EffectsType effectsType) {
        appendChild(EFFECTSTYPE_PROPERTY, effectsType);
    }

    public void removeEffectsType(EffectsType effectsType) {
        removeChild(EFFECTSTYPE_PROPERTY, effectsType);
    }

    public void accept(NiftyComponentVisitor visitor) {
        visitor.visit(this);
    }

}