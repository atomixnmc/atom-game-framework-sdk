/* Copyright 2012 Aguzzi Cristiano

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.jme3.gde.gui.base.model.elements;

import de.lessvoid.nifty.builder.ImageBuilder;
import com.jme3.gde.gui.base.model.GUIFactory;
import com.jme3.gde.gui.base.model.GUITypes;
import java.util.Map;
import org.w3c.dom.Element;

/**
 *
 * @author cris
 */
public class GImage extends GElement {
/*
    static {
        GUIFactory.registerProduct(new GImage());
    }
*/
    /**
     * only for Factory use
     */
    public GImage() {
        super();
    }

    public GImage(String id, org.w3c.dom.Element docElement) throws IllegalArgumentException {
        super(id, docElement);
        if (!docElement.getTagName().equals(GUITypes.IMAGE.toString())) {
            throw new IllegalArgumentException("Illegal tag name");
        }
        super.builder = new ImageBuilder(id);

    }

    @Override
    public GUITypes getType() {
        return GUITypes.IMAGE;
    }

    public Map<String, String> getAttributes() {
        Map<String, String> res = super.getAttributes();
        /*
         for(String prop : com.jme3.gde.gui.ngeditor.model.PropretiesResolver.inst.resolve("imageType")){
         String defvalue = getAttribute(prop);
         res.put(prop, defvalue);
         }
         */
        return res;
    }

    @Override
    public GElement create(String id, Element ele) {
        return new GImage(id, ele);
    }

    @Override
    public void initDefault() {
        domElement.setAttribute("filename", "jada/ngeditor/resources/noImage.png");
        domElement.setAttribute("width", "31%");
        domElement.setAttribute("height", "30%");
    }
}
