/*
 
 */
package com.jme3.gde.gui.extra.xam.model;


/**
 * Interface for domain component effectValueType.
 *
 * @author cuongnguyen
 */
// Generated by XAM AutoGen Tool v0.2
public interface EffectValueType extends NiftyComponent {

    // attribute property change event names
    public static final String TIME_PROPERTY = "time"; // NOI18N
    public static final String VALUE_PROPERTY = "value"; // NOI18N
    public static final String OFFSET_PROPERTY = "offset"; // NOI18N
    public static final String COLOR_PROPERTY = "color"; // NOI18N
    // child element property change event names

    public String getTime();
    public void setTime(String time);
	
    public String getValue();
    public void setValue(String value);
	
    public String getOffset();
    public void setOffset(String offset);
	
    public String getColor();
    public void setColor(String color);
	
}