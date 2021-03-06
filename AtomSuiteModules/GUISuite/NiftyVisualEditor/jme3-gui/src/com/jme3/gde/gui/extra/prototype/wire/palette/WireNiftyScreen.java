
package com.jme3.gde.gui.extra.prototype.wire.palette;

public class WireNiftyScreen {

    private Integer number;
    private String category;
    private String image;

    public WireNiftyScreen(Integer number, String category, String image) {
        this.number = number;
        this.category = category;
        this.image = image;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}