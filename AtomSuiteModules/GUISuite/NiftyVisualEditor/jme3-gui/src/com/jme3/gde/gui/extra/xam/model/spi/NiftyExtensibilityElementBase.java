/*
 
 */
package com.jme3.gde.gui.extra.xam.model.spi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.jme3.gde.gui.extra.xam.model.NiftyComponent;
import com.jme3.gde.gui.extra.xam.model.NiftyModel;
import com.jme3.gde.gui.extra.xam.model.NiftyExtensibilityElement;
import com.jme3.gde.gui.extra.xam.model.visitor.NiftyComponentVisitor;
import org.netbeans.modules.xml.xam.dom.Attribute;
import org.w3c.dom.Element;

/**
 * Base implementation for all the extensibility elements.
 *
 * @author cuongnguyen
 */
// Generated by XAM AutoGen Tool v0.2
public class NiftyExtensibilityElementBase extends NiftyComponentBase 
        implements NiftyExtensibilityElement.ParentSelector {
    
    public NiftyExtensibilityElementBase(NiftyModel model, Element e) {
        super(model, e);
    }
     
    public void accept(NiftyComponentVisitor visitor) {
        visitor.visit(this);
    }

    public static class StringAttribute implements Attribute {
        private String name;
        public StringAttribute(String name) { this.name = name; }
        public Class getType() { return String.class; }
        public String getName() { return name; }
        public Class getMemberType() { return null; }
    }
    
    public String getAttribute(String attribute) {
        return getAttribute(new StringAttribute(attribute));
    }
    
    public void setAttribute(String attribute, String value) {
        setAttribute(attribute, new StringAttribute(attribute), value);
    }
    
    public String getContentFragment() {
        return super.getXmlFragment();
    }
    
    public void setContentFragment(String text) throws IOException {
        super.setXmlFragment(CONTENT_FRAGMENT_PROPERTY, text);
    }

    public void addAnyElement(NiftyExtensibilityElement anyElement, int index) {
        List<NiftyComponent> all = getChildren();
        if (index > all.size() || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        insertAtIndex(EXTENSIBILITY_ELEMENT_PROPERTY, anyElement, index);
    }

    public void removeAnyElement(NiftyExtensibilityElement any) {
        super.removeExtensibilityElement(any);
    }

    public List<NiftyExtensibilityElement> getAnyElements() {
        List<NiftyExtensibilityElement> result = new ArrayList<NiftyExtensibilityElement>();
        List<NiftyExtensibilityElement> allEEs = super.getExtensibilityElements();
        for (NiftyExtensibilityElement ee : allEEs) {
            if (! ee.getModel().getQNames().contains(ee.getQName())) {
                result.add(ee);
            }
        }
        return Collections.unmodifiableList(result);
    }   

    /**
     * Generic extensibility by default can be added to any Nifty component.
     */
    public boolean canBeAddedTo(org.netbeans.modules.xml.xam.Component target) {
        if (target instanceof NiftyComponent) {
            return true;
        }
        return false;
    }
}
