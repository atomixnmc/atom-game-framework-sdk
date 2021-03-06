/*
 
 */
package com.jme3.gde.gui.extra.xam.model;


/**
 * Interface for domain component textType.
 *
 * @author cuongnguyen
 */
// Generated by XAM AutoGen Tool v0.2
public interface TextType extends NiftyComponent, ElementType {

    // attribute property change event names
    public static final String TEXT_PROPERTY = "text"; // NOI18N
    public static final String LAYOUT_PROPERTY = "layout"; // NOI18N
    public static final String FONT_PROPERTY = "font"; // NOI18N
    public static final String COLOR_PROPERTY = "color"; // NOI18N
    // child element property change event names

    public String getText();
    public void setText(String text);
	
    public LayoutType getLayout();
    public void setLayout(LayoutType layout);
	
    public String getFont();
    public void setFont(String font);
	
    public String getColor();
    public void setColor(String color);
	
}