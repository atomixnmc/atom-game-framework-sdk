/*
 
 */
package com.jme3.gde.gui.extra.xam.model;

import java.util.List;

/**
 * Interface for domain component styleType.
 *
 * @author cuongnguyen
 */
// Generated by XAM AutoGen Tool v0.2
public interface StyleType extends NiftyComponent {

    // attribute property change event names
    public static final String ID_PROPERTY = "id"; // NOI18N
    public static final String BASE_PROPERTY = "base"; // NOI18N
    // child element property change event names
    public static final String ATTRIBUTESTYPE_PROPERTY = "attributesType"; // NOI18N
    public static final String INTERACTTYPE_PROPERTY = "interactType"; // NOI18N
    public static final String EFFECTSTYPE_PROPERTY = "effectsType"; // NOI18N

    public String getId();
    public void setId(String id);
	
    public String getBase();
    public void setBase(String base);
	
    public List<AttributesType> getAttributesTypes();
    public void addAttributesType(AttributesType attributesType);
    public void removeAttributesType(AttributesType attributesType);

    public List<InteractType> getInteractTypes();
    public void addInteractType(InteractType interactType);
    public void removeInteractType(InteractType interactType);

    public List<EffectsType> getEffectsTypes();
    public void addEffectsType(EffectsType effectsType);
    public void removeEffectsType(EffectsType effectsType);

}