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
package com.jme3.gde.gui.base.model.exception;

import com.jme3.gde.gui.base.model.GUIFactory;


/**
 * Idicates a no product for your request in ElementFactory
 * @see GUIFactory
 * @author Aguzzi Cristiano
 */
public class NoProductException extends Exception{
    private String pr;
    
    public NoProductException(String product){
        super("No product for tag: " + product );
        this.pr=product;
    }
    /**
     * Request for the product not found
     * @return the product name 
     */
    public String getProduct(){
        return this.pr;
    }
}
