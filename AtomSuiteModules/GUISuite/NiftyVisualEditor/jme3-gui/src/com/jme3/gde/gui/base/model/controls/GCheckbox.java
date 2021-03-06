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
package com.jme3.gde.gui.base.model.controls;

import com.jme3.gde.gui.base.model.GUIFactory;
import com.jme3.gde.gui.base.model.GUITypes;
import de.lessvoid.nifty.controls.checkbox.builder.CheckboxBuilder;
import com.jme3.gde.gui.base.model.elements.GElement;
import com.jme3.gde.gui.base.model.elements.GElement;

/**
 *
 * @author cris
 */
public class GCheckbox extends GElement {
    /*
     static{
     GUIFactory.registerProduct(new GCheckbox());
     }
    
     */

    public GCheckbox() {
        super();
    }

    public GCheckbox(String id, org.w3c.dom.Element docElement) {
        super(id, docElement);
        if (!docElement.getTagName().equals("control")) {
            throw new IllegalArgumentException("Illegal tag name");
        }
        super.builder = new CheckboxBuilder(id);

    }

    @Override
    public GUITypes getType() {
        return GUITypes.CHECKBOX;
    }

    @Override
    public void initDefault() {
        domElement.setAttribute("name", GUITypes.CHECKBOX.toString());
    }

    @Override
    public GElement create(String id, org.w3c.dom.Element ele) {
        return new GCheckbox(id, ele);
    }
}
