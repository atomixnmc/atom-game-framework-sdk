/*
 
 */
package com.jme3.gde.gui.extra.xam.model.impl;

import com.jme3.gde.gui.extra.xam.model.ElementTypeImpl;
import com.jme3.gde.gui.extra.xam.model.NiftyComponent;
import com.jme3.gde.gui.extra.xam.model.NiftyQName;
import java.util.Collections;
import javax.xml.namespace.QName;
import java.util.Set;
import com.jme3.gde.gui.extra.xam.model.spi.ElementFactory;
import org.w3c.dom.Element;

/**
 * Provides element factories for all the elements in the Nifty domain.
 * 
 * @author cuongnguyen
 */
// Generated by XAM AutoGen Tool v0.2
public class NiftyElementFactoryProvider {

    public static class ElementTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.ELEMENTTYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new ElementTypeImpl(context.getModel(), element);
        }
    }

    public static class LayerTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.LAYERTYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new LayerTypeImpl(context.getModel(), element);
        }
    }

    public static class PanelTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.PANELTYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new PanelTypeImpl(context.getModel(), element);
        }
    }

    public static class ImageTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.IMAGETYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new ImageTypeImpl(context.getModel(), element);
        }
    }

    public static class TextTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.TEXTTYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new TextTypeImpl(context.getModel(), element);
        }
    }

    public static class ControlDefinitionFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.CONTROLDEFINITION.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new ControlDefinitionImpl(context.getModel(), element);
        }
    }

    public static class ControlTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.CONTROLTYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new ControlTypeImpl(context.getModel(), element);
        }
    }

    public static class UseStylesTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.USESTYLESTYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new UseStylesTypeImpl(context.getModel(), element);
        }
    }

    public static class UseControlsTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.USECONTROLSTYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new UseControlsTypeImpl(context.getModel(), element);
        }
    }

    public static class RegisterSoundTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.REGISTERSOUNDTYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new RegisterSoundTypeImpl(context.getModel(), element);
        }
    }

    public static class RegisterEffectTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.REGISTEREFFECTTYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new RegisterEffectTypeImpl(context.getModel(), element);
        }
    }

    public static class RegisterMusicTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.REGISTERMUSICTYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new RegisterMusicTypeImpl(context.getModel(), element);
        }
    }

    public static class RegisterMouseCursorTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.REGISTERMOUSECURSORTYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new RegisterMouseCursorTypeImpl(context.getModel(), element);
        }
    }

    public static class ResourceBundleTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.RESOURCEBUNDLETYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new ResourceBundleTypeImpl(context.getModel(), element);
        }
    }

    public static class AttributesTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.ATTRIBUTESTYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new AttributesTypeImpl(context.getModel(), element);
        }
    }

    public static class InteractTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.INTERACTTYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new InteractTypeImpl(context.getModel(), element);
        }
    }

    public static class EffectValueTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.EFFECTVALUETYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new EffectValueTypeImpl(context.getModel(), element);
        }
    }

    public static class SingleEffectTypeBaseFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.SINGLEEFFECTTYPEBASE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new SingleEffectTypeBaseImpl(context.getModel(), element);
        }
    }

    public static class SingleEffectTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.SINGLEEFFECTTYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new SingleEffectTypeImpl(context.getModel(), element);
        }
    }

    public static class SingleEffectTypeOnHoverFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.SINGLEEFFECTTYPEONHOVER.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new SingleEffectTypeOnHoverImpl(context.getModel(), element);
        }
    }

    public static class OnHoverTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.ONHOVERTYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new OnHoverTypeImpl(context.getModel(), element);
        }
    }

    public static class SingleEffectTypeHoverFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.SINGLEEFFECTTYPEHOVER.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new SingleEffectTypeHoverImpl(context.getModel(), element);
        }
    }

    public static class EffectsTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.EFFECTSTYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new EffectsTypeImpl(context.getModel(), element);
        }
    }

    public static class StyleTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.STYLETYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new StyleTypeImpl(context.getModel(), element);
        }
    }

    public static class PopupTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.POPUPTYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new PopupTypeImpl(context.getModel(), element);
        }
    }

    public static class ScreenTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.SCREENTYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new ScreenTypeImpl(context.getModel(), element);
        }
    }

    public static class NiftyTypeFactory implements ElementFactory {
        public Set<QName> getElementQNames() {
            return Collections.singleton(NiftyQName.NIFTYTYPE.getQName());
        }
        public NiftyComponent create(NiftyComponent context, Element element) {
            return new NiftyTypeImpl(context.getModel(), element);
        }
    }

}