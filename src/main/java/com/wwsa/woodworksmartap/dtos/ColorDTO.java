package com.wwsa.woodworksmartap.dtos;

import javax.persistence.Column;

public class ColorDTO {
    private int ColorID;
    private String NameColor;

    public int getColorID() {
        return ColorID;
    }

    public void setColorID(int colorID) {
        ColorID = colorID;
    }

    public String getNameColor() {
        return NameColor;
    }

    public void setNameColor(String nameColor) {
        NameColor = nameColor;
    }
}
