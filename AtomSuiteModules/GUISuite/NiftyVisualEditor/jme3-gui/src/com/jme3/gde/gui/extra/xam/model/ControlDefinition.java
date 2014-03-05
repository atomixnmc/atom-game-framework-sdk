/*
 
 */
package com.jme3.gde.gui.extra.xam.model;

import java.util.List;
import org.netbeans.modules.xml.xam.Nameable;

/**
 * Interface for domain component controlDefinition.
 *
 * @author cuongnguyen
 */
// Generated by XAM AutoGen Tool v0.2
public interface ControlDefinition extends NiftyComponent, Nameable<NiftyComponent> {

    // attribute property change event names
    public static final String CONTROLLER_PROPERTY = "controller"; // NOI18N
    // child element property change event names
    public static final String ELEMENTTYPE_PROPERTY = "elementType"; // NOI18N

    public String getController();
    public void setController(String controller);
	
    public List<ElementType> getElementTypes();
    public void addElementType(ElementType elementType);
    public void removeElementType(ElementType elementType);

}